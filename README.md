# Muxing  [![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-Muxing%20Library-green.svg?style=flat )]( https://android-arsenal.com/details/1/6558 )

This is an example of muxing Audio and Video of same length and Quality
With this library we can mux videos and audios.
Example youtube video at 480p provide video slone and audio alone urls. So we can download both and mux them.

Getting started
---

Step1. Just add these lines to `build.gradle`.

```gradle
dependencies {
   compile 'com.github.GitEliteNovice:Muxing:1.0.0'
  
    {
      transitive =true;
    }
   
    }
}
```

Step2. Add it in your root `build.gradle` at the end of repositories:
```gradle
allprojects 
{ 
repositories 
  
  { 
     ...
    maven
    {
       url 'https://jitpack.io' 
    }
  }
}

```

## Why would anyone want to use this?
If your App is Providing a Fuctionality of downloding Videos from some where ... and your Server Provide two seprate Url one is for audio(Alone) and one is for Video(Without audio). Then this Would be life save for your app.Your do not have to write lots of bipolar code code just .. pass the path of downloaded audio and video in this libarary  and boom. Congrats! You will get a Complete Video just in Few Seconds.    



Libraries used in this project
------------------------------

* [Mp4Parser] 


It is important to emphasize that you cannot append any two tracks with: 
 
 * Different resolutions 
 * Different frame-rates
