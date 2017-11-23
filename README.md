# Muxing
This is an example of muxing Audio and Video of same length and Quality
With this library we can mux videos and audios.
Example youtube video at 480p provide video slone and audio alone urls. So we can download both and mux them.

 Add it in your root build.gradle at the end of repositories:

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


Step 2. Add the dependency


dependencies { compile 'com.github.GitEliteNovice:Muxing:1.0.0' } 
