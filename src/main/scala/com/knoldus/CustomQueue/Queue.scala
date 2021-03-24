package com.knoldus.CustomQueue
import scala.collection.immutable.List
import scala.util.Try
class Queue[+X](list:List[X]) {
  override def toString: String = list.toString
  def enqueue[Y >: X](input: Y): Queue[Y] = {
    new Queue[Y](list :+ input)
  }
  def dequeue[Y >: X]: Try[Queue[Y]] = {
    Try(new Queue[Y](list.tail))
  }
}