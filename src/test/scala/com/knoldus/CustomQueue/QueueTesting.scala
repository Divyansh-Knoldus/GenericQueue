package com.knoldus.CustomQueue
import org.scalatest.flatspec.AnyFlatSpec
class QueueTesting extends AnyFlatSpec {

  "Queue" should "return enqueue valu as it is empty" in{
    val queue = new Queue[String](List())
    val enqueued = queue.enqueue("Hi").toString
    assertResult("List(Hi)")(enqueued)
  }
  "queue" should "return enqueued list of string" in{
    val queue = new Queue[String](List("Divyansh"))
    val result=queue.enqueue("Devrani").toString
    assertResult("List(Divyansh, Devrani)")(result)
  }
  "queue" should "return dequeued list of string" in{
    val queue = new Queue[String](List("Divyansh"))
    val enqueued = queue.enqueue("Devrani")
    val dequeued=enqueued.dequeue.toString
    assertResult("Success(List(Devrani))")(dequeued)
  }
  "queue" should "return enqueued list of int" in{
    val queue = new Queue[Int](List(0))
    val result=queue.enqueue(1).toString
    assertResult("List(0, 1)")(result)
  }
  "queue" should "return dequeued list of int" in{
    val queue = new Queue[Int](List(0))
    val enqueued = queue.enqueue(1)
    val dequeued=enqueued.dequeue.toString
    assertResult("Success(List(1))")(dequeued)
  }
}