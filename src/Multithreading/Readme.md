/*
* 🎯 Objective: Understand how Synchronization works in Java
*
* Java allows synchronization in four primary ways:
*
* 1. ✅ Synchronized Instance Method
*    - The thread acquires a lock on the **current object** (`this`)
*    - Other threads cannot enter **any other synchronized method** on the same object
*
* 2. ✅ Synchronized Block on `this`
     - The thread acquires a lock on the **current object** (`this`)
*    - Other threads cannot enter **any other synchronized method** on the same object
*    - Only the synchronized block is protected

*
* 3. ✅ Synchronized Block on a Shared Object (e.g., a queue)
*    - Lock is acquired only on the **shared object**
*    - The object itself (`this`) is *not* locked
*    - Other threads can still call synchronized methods on `this`
*
* 4. ✅ Static Synchronized Method
*    - The thread acquires a lock on the **Class object** (`MyClass.class`)
*    - This is shared across **all instances**
*    - Does *not* interfere with instance-level locks (`this`)
       */

## **Wait and notify**
wait() and notify() are instance methods defined in the Object class.
for inter-thread communication

**wait()** causes the current thread to **release** the object's intrinsic lock and go into the waiting state until it is notified.

**notify()** wakes one thread waiting on the same object's monitor so it can attempt to **reacquire the lock** and proceed.

Since both methods operate on the object's monitor (lock), they **must be called from within a synchronized context** (i.e., the thread must hold the lock on that object).
If you call wait() or notify() outside a synchronized block or method, the JVM will throw an **IllegalMonitorStateException**, because the thread is trying to interact with a monitor it doesn’t hold.

## **Synchronized data structures**
BlockingQueue

ConcurrentHashMap for maps,
CopyOnWriteArrayList for read-heavy lists,  
BlockingQueue for producer–consumer setups.
Avoid legacy classes like Vector and Hashtable unless absolutely needed for compatibility.

**Exceptions**
Exception in thread "Thread-1" java.lang.IllegalMonitorStateException: current thread is not  - when wait is called on non-synchronized method
