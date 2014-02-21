Head First Java Chapter 15
=
This is the fifteenth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the fifteenth chapter, not sure if any copyright issues are there.

Networking & Threads
-

### Bullet Points (Networking):-
* Client and server applications communicate over a Socket connections.
* A Socket represents a connection between two applications which may (or may not) be running on two different physical machines.
* A client must know the IP Address(or domain name) and TCP port number of the server application.
* A TCP port is a 16-bit unsigned number assigned to a specific server application. TCP port numbers allow different clients to connect to the same machine but communicate with different applications running on that machine.
* The port number from 0 to 1023 are reserved for 'well known services' including HTTP, FTP, SMTP, etc.
* A client connects to a server by making a Server socket

````java
Socket s = new Socket("127.0.0.1",4242);
````

* Once connected, a client can get input and output streams from the socket. These are low-level 'connection' streams.

````java
sock.getInputStream()
````

* To read text data from the server, create a BufferedReader, chained to an InputStreamReader, which is chained to the input stream from the Socket.
* InputStreamReader is a 'bridge' stream that takes in bytes and converts them to text (character) data. It's used primarily to act as the middle chain between the high-level BufferedReader and the low-level socket input stream.
* To write text data to the server, create a PrintWriter chained directly to the Socket's output stream. Call the print() or println() methods to send Strings to the server.
* Servers use a ServerSocket that waits for client requests on a particular port number.
* When a ServerSocket gets a request, it 'accepts' the request by making a Socket Connection with the client.

### Bullet Points (Threads):-
* A thread with a lower-case 't' is a separate thread of execution in Java.
* Every thread in Java has its own call stack.
* A Thread with a capital 'T' is the java.lang.Thread class. A Thread object represents a thread of execution.
* A Thread needs a job to do. A Thread's job is an instance of something that implements the Runnable interface.
* The Runnable interface has just a single method, run(), This is the method that goes on the bottom of the new call stack. In other words, it is the first method to run in the new thread.
* To launch a new thread, you need a Runnable to pass to the Thread's constructor.
* A thread is in the NEW state when you have instantiated a Thread object but have not yet called start().
* When you start a thread , a new stack is created, with the Runnable's run() method on the bottom of the stack.The thread is now in the RUNNABLE state, waiting to be chosen to run.
* A thread is said to be RUNNING when the JVMs thread scheduler has selected it to be the currently-running thread. On a single processor machine, there can be only one currently running thread.
* Sometimes a thread can be moved from the RUNNING state to a BLOCKED state. A thread might be blocked because it's waiting for data from a stream, or because it has gone to sleep, or because it is waiting for an object's lock.
* Thread scheduling is not guaranteed to work in any particular way, so you cannot be certain that threads will take turns nicely, You can help influence turn-taking by putting your threads to sleep periodically.

### Bullet Points (Threads Sleep):-
* The static Thread.sleep() method forces a thread to leave the running state for at least the duration passed to the sleep method.
* The sleep() method throws a checked exception (InterruptedException) so all calls to sleep() must be wrapped in a try/catch, or declared.
* You can sleep() to help make sure all threads get a chance to run, although there's no guarantee that when a thread wakes up it'll go to the end of the runnable line. It might, for example, go right back to the front.
* You can name a thread using the setName() method. All threads get a default name, but giving them a explicit name can help you keep tracks of threads, especially if you're debugging with print statements.
* You can have serious problems with threads if two or more threads have access to the same object on the heap.
* Two or more threads accessing the same object can lead to data corruption if one thread, for example, leaves the running state while still in the middle of manipulating an object's critical state.
* To make your objects thread-safe, decide which statements should be treated as one atomic process.
* Use the keywords **synchronized** to modify a method declaration, when you want to prevent two threads from entering that method.
* Every object has a single lock, with a single key for that lock. Most of the time we don't care about that lock; lock come into play only when an object has synchronized methods.
* When a thread attempts to enter a synchronized method, the thread must get the key for the object. If the key is not available, the thread goes into a kind of waiting lounge, until the key becomes available.
* Even if an object has more than one synchronized method, there is still only one key. Once any thread has entered a synchronized method on that object, no thread can enter any other synchronized method on the same object. This restriction lets you protect your data by synchronizing any method that manipulates the data.
