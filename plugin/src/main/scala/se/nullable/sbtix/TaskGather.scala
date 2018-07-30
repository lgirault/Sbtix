package se.nullable.sbtix

import coursier.util.Gather
import scalaz.concurrent.Task
import scalaz.std.list._
import scalaz.Traverse

trait TaskGather extends Gather[Task] {
  def point[A](a: A): Task[A] = Task.point(a)
  def bind[A, B](elem: Task[A])(f: A => Task[B]): Task[B] =
    elem.flatMap(f)

  def gather[A](elems: Seq[Task[A]]): Task[Seq[A]] =
    Traverse[List].traverse[Task, Task[A], A](elems.toList)(identity)

}
