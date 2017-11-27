# Muxing
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
Libraries used in this project
------------------------------

* [Mp4Parser] 


It is important to emphasize that you cannot append any two tracks with: 
 
 * Different resolutions 
 * Different frame-rates
