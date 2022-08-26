package com.example.parcelable

import java.io.Serializable

class TestData (var name: String, var value: Int)

class ChildData(var name: String,  var age: Int): Serializable