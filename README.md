# movie-chooser

The objective of this project is to generate random movie poster when you do not know what do you want to watch!

## Getting started

### TMDB API key
 - You have to create your own API key on to use this project locally.
 - Follow the steps here https://developers.themoviedb.org/3/getting-started/introduction
 
### IDE

- git clone https://github.com/analudias/movie-chooser.git
- Import project into your IDE
- Create a class to include your API key, like example below:
<pre><code>
package com.analudias.moviechooser.constants;

public interface ConstantsKey {
	
	public static final String apiKey = "yourApiKey";

}
</code></pre>
- Run project

### Postman
- Create request
  - GET find movie by id
    - <code>http://localhost:8080/{{randomNumer_SO}}</code>
  - Create variable **randomNumer_SO** on tab Pre-request Script
    - <code>pm.globals.set('randomNumer_SO',_.random(1, 1015522));</code>
- Run request
