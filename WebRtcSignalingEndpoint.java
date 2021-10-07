package com.itsallbinary.tutorial.vconf;
 
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
 
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
 
/**
 * Signaling server to WebRTC video conferencing.
 */
@ServerEndpoint("/signal")
public class WebRtcSignalingEndpoint {
 
	private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());
 
	@OnOpen
	public void whenOpening(Session session) throws IOException, EncodeException {
		System.out.println("Open!");
		// Add websocket session to a global set to use in OnMessage.
		sessions.add(session);
	}
 
	@OnMessage
	public void process(String data, Session session) throws IOException {
		System.out.println("Got signal - " + data);
		/*
		 * When signal is received, send it to other participants other than self. In
		 * real world, signal should be sent to only participant's who belong to
		 * particular video conference.
		 */
		for (Session sess : sessions) {
			if (!sess.equals(session)) {
				sess.getBasicRemote().sendText(data);
			}
		}
	}
 
	@OnClose
	public void whenClosing(Session session) {
		System.out.println("Close!");
		sessions.remove(session);
	}

/**
	 * Process message received from browser.
	 */
	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.println("Message received [" + session.getId() + "] Message=" + message);
 
	}
 
	/**
	 * Container calls this method when there is an error in websocket
	 * communication.
	 */
	@OnError
	public void onError(Throwable t) {
		System.out.println("Error - " + t.getMessage());
	}
}
 
/**
 * This is a custom thread which sends message to browser every 2000
 * milliseconds.
 */
class ServerToBrowserMessageSender extends Thread {
 
	private int count = 0;
	private Session session;
 
	public ServerToBrowserMessageSender(Session session) {
		this.session = session;
	}
 
	@Override
	public void run() {
 
		while (count < 5) {
			count++;
			try {
				// Send message to browser ever 2000 milliseconds.
				Thread.sleep(2000);
				session.getBasicRemote()
						.sendText("[Server -> Browser] A Message from server to browser. Count = " + count);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
