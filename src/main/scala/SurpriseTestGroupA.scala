// FIND A SPECIFIC CHARACTER IN A STRING AND REPLACE IT WITH ANOTHER CHARACTER
package com.knoldus
import scala.io.StdIn

object SurpriseTestGroupA extends App
{
  val userInputString = StdIn.readLine()
  val userInputCharacter = StdIn.readChar()
  val userInputCharacterToReplace = StdIn.readChar()
  println(userInputString.replace(userInputCharacter,userInputCharacterToReplace))
}
