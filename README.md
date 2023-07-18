# CN-Project
Computer Networks Course Project (Project Topic: Integrated Communication Application)

# *ABSTRACT*

Developed a video calling application as a project for Computer Networks, using WebRTC framework to enable real-time communication between browsers without a server in between.
Created two user interfaces for sender and receiver, allowing users to join calls, share screens, and toggle microphone and camera using simple toggle buttons. 
Implemented a sophisticated solution with an end button to quickly end calls, ensuring faster response time for users.

# INTRODUCTION

In the creation of this application, we used WebRTC API. WebRTC consists of several interrelated APIs and protocols which work together to achieve Real Time Communication.

# WebRTC
WebRTC stands for Web Real-Time Communication. It enables peer-to-peer communication without any server in between and allows the exchange of audio, video, and data between the connected peers. With WebRTC, the role of the server is limited to just helping the two peers discover each other and set up a direct connection.

<img width="538" alt="Screenshot 2023-07-18 at 10 45 17 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/2654f791-e4a0-4dcc-accd-13fad5fed8ea">

<img width="514" alt="Screenshot 2023-07-18 at 10 46 01 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/32185c2c-947b-41dc-bf30-d68dda8e1d23">

What actually happens is that Client1 send some data to the signalling server and it will send that data to the other client and the client will store this data. Similarly, client 2 will perform the same action and a connection will get established between two clients.

<img width="598" alt="Screenshot 2023-07-18 at 10 46 34 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/c37ce963-d117-4889-8c46-148e2d9ab620">

Client 1 creates an offer and it has a SDP (Session description protocol) and it basically the media configuration of the client and it sends it to server and it sends it to the client2 who stores the information.
So now client 2 has to create an answer in response to that offer (which is configuration of client2) and sends it to client 1 through signalling server.
For them to convert with each other they need transfer their network configuration data.
When client1 creates the offer then ICE (Interactive Connectivity Establishment) starts coming out of webRTC API from STUN and TURN server and ore send to client 2 through signalling server. Client 2 also does the same while sending its answer to client1.
ICE candidates are generated from STUN and TURN servers. For this client 1 has to provide the URLs of the STUN and TURN server to the webRTC API
Now it sends the ICE candidates to the client 2 through signalling server. Client 2 also does same in return.

Now both the clients have network information about each other and now they can correct peer to peer.

<img width="456" alt="Screenshot 2023-07-18 at 10 47 40 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/d8b2b47b-7a5e-4a42-a2d1-a9fd4c6539dc">

#PROJECT Screenshots

<img width="431" alt="Screenshot 2023-07-18 at 10 49 00 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/82ff2ac2-7166-4c01-a624-ec9ee2825973">

<img width="403" alt="Screenshot 2023-07-18 at 10 49 26 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/5e950cfd-065c-4af8-a1eb-b58389efa3e6">

<img width="306" alt="Screenshot 2023-07-18 at 10 49 43 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/5efc4f74-9d89-4cf7-8b25-3c9ea4f30dc1">

<img width="360" alt="Screenshot 2023-07-18 at 10 49 59 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/d724fe27-4da1-44f5-b460-cb41c280b3e0">

<img width="367" alt="Screenshot 2023-07-18 at 10 50 18 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/e0d6f724-664a-494e-9fff-1ca39d742528">

<img width="321" alt="Screenshot 2023-07-18 at 10 50 36 PM" src="https://github.com/MadhurMehta07/CN-Project/assets/72685410/e1f7d737-3403-4280-a93f-b59768f4d1ed">

# FUTURE OF THE PROJECT

As already mentioned above we all ourselves progressive and this is proved in our work and dedication to implement every feature into our video conferencing app. We are not done yet. For now, we just have the basic structure ready while we see a bright future of our video conferencing app which includes a “Share Music” which we believe creates a moment between the classes or stressed meets to ease the moment. Also, we do seek legal permissions from every streaming device so as to perfectly enable a feature of Share View to our users effortlessly so that they can you literally any streaming application through our video conferencing solution. We also find new updates coming up day by day to the world of video conferencing and hence is our progressive solution ever updating.







