package section1

fun thread(start: Boolean=true, isDaemon: Boolean=false, contextclassLoader: ClassLoader?=null, name: String?=null, priority: Int=-1, block: () -> Unit): Thread{
    val thread=object: Thread(){
        public override fun run(){
            block()
        }
    }

    if(isDaemon)
        thread.isDaemon=true

    if(priority>0)
        thread.priority=priority

    if(name!=null)
        thread.name=name

    if(contextclassLoader!=null)
        thread.contextClassLoader=contextclassLoader

    if(start)
        thread.start()

    return thread
}

fun main() {
    thread(start=true){
        println("Current Threads(Custom function): ${Thread.currentThread()}")
        println("Priority: ${Thread.currentThread().priority}")
        println("Name: ${Thread.currentThread().name}")
        println("Name: ${Thread.currentThread().isDaemon}")
    }
}