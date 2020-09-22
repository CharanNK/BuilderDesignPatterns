# CreationalDesignPatterns
**BUILDER PATTERN**
  * Some objects are simple and can be created in a simple constructor call
  * Other objects require a lot of ceremony to create
  * Having an object with 10 constructor arguments is not productive.
  * Instead opt for piecewise construction
  * Builder provides an API for constructing an object step-by-step.

> **“When piecewise object construction is complicated, provide an API for doing it succinctly”**

  * Builder is more like a constructor element, at some point it has to have a method that returns the final object.
  * __Fluent builder__ - always returns the current state of the builder object.
  * **Fluent builder with recursive generics** - recursive generics to be used in case of inheritance of the builder class.
  * **Faceted builder** - sometimes the builder we are creating is so complicated that a single builder is not sufficient. We need more than one builder.

  * Summary on Builder Pattern :
    * A builder is separate component for building an object
    * Can either give builder a constructor or return it via a static function.
    * To make builder fluent return this
    * Different facets of an object can be built with different builder working in tandem via a base class.
