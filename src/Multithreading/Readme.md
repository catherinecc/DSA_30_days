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
