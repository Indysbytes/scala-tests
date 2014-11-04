package com.indy


case class Artist(fname:String, surname:String)

class Album(val title: String, val year: Int, val artist: Artist)  {

    if(artist.fname == "") throw new IllegalArgumentException("An artist fname cannot be empty")

}











