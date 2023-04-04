# Dagger-Hilt
dagger Hilt  ➤ Request object from Field Injection , Constructor Injection Otherwise  @Modules

<h2>Dependency Injection</h2>

<p>(DI) is a design pattern to decouple the conventional dependency relationship between objects. 
When it comes to DI in android Dagger always takes a lead. But it is very complex and requires
a lot of boilerplate codes in order to set up the Dagger. So, to overcome this problem Hilt was 
introduced. Dagger Hilt simplifies the whole process and reduces the unnecessary steps without 
losing any of the features of the original Dagger.</p>

<h2> Step 1: Create a New Project </h2>

To create a new project in Android Studio please refer to How to Create/Start a New Project in Android Studio. Note that select Kotlin as the programming language.

<h2> Step 2: Adding dependencies </h2>
<p>
In order to use Dagger Hilt, we need to add the dependencies for it. First, we will add the classpath to our project-level build.gradle file. For adding this dependency Go to Gradle Scripts > build.gradle(Project:app) add the following dependency. After adding these dependencies you need to click on Sync Now.
</p>
<p>
dependencies {
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.38.1'
    }
    </p>
    <p>
Now, in the app-level build.gradle file we need to place a plugin. For this, Go to Gradle Scripts > build.gradle(Module:app) add the following plugin.
   </p>
    <p>
plugins {
    id 'kotlin-android'
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}
   </p>
    <p>
We also need to add the dependency in the same app-level build.gradle file. Following dependency needs to be added inside the build.gradle(Module:app).
</p>
 <p>
dependencies {
    implementation 'com.github.bumptech.glide:glide:4.9.0'
    implementation 'com.google.dagger:hilt-android:2.38.1'
    kapt 'com.google.dagger:hilt-android-compiler:2.38.1'
    kapt 'androidx.hilt:hilt-compiler:1.0.0'
    implementation "androidx.activity:activity-ktx:1.4.0"
}
 </p>
  <p>
We also need to add property attributes in gradle.properties file. Go to <h3>Gradle Scripts > </h3> gradle.properties and add the following property.
 </p>
   <p>
kapt.use.worker.api=false
 </p>


