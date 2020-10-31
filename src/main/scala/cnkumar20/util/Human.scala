package cnkumar20.util

class Human extends Home {
  override def sleep(): Unit = {
    println("I am Sleeping")
  }

  override def play(): Unit = {
    println("I am Awake")
  }

  override def work(): Unit = {
    println("I am working")
  }
}
