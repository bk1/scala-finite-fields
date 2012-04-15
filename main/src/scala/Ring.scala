package com.itsky.finitefields;

trait RingElement {
  def ring : Ring;

  def +(other: RingElement) {
    ring.add(this, other)
  }

  def -(other: RingElement) {
    ring.sub(this, other)
  }

  def *(other: RingElement) {
    ring.mul(this, other)
  }

  // TODO: **, sqrt, etc.
}

trait Ring {
  def zero : RingElement;

  def one : RingElement;

  def add(left : RingElement, right: RingElement) : RingElement;

  def sub(left : RingElement, right: RingElement) : RingElement;

  def mul(left : RingElement, right: RingElement) : RingElement;

  def neg(element : Ringelement)  : RingElement;

  def mulInverse(element : Ringelement)  : RingElement;

}
