# Picasso
Displaying images is easiest using a third party library such as Picasso from Square which will download and cache remote images and abstract the complexity behind an easy to use DSL.
Before Using Picasso , do not forget to add internet permission in the manifest file .

### GRADLE
```gradle
implementation 'com.squareup.picasso:picasso:2.71828'

```

### Picasso Use

```java
Picasso.get().load(movies.getMovieImages()).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .resize(350, 350).into(holder.movieImage);

```

### Screen Short 

<img src="https://github.com/apptech44/picasso-library-app/blob/master/piccose-library.png" data-canonical-src="https://github.com/apptech44/picasso-library-app/blob/master/piccose-library.png" width="400" height="400" />

## Work Done!
