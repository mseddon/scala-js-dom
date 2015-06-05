package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.typedarray.{ArrayBufferView, ArrayBuffer, Uint8Array}

package object crypto {
  type BigInteger = Uint8Array

  sealed trait BufferSource extends js.Any

  implicit def arrayBuffer2BufferSource(b: ArrayBuffer): BufferSource =
    b.asInstanceOf[BufferSource]

  implicit def arrayBufferView2BufferSource(b: ArrayBufferView): BufferSource =
    b.asInstanceOf[BufferSource]
}
