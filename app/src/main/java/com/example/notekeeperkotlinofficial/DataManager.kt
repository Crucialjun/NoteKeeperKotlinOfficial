package com.example.notekeeperkotlinofficial

class DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents","Android Programming with Intents")
        courses.set(course.courseID,course)

        course = CourseInfo(courseID = "android_async",title = "Android Async Programming and services")
        courses.set(course.courseID,course)

        course = CourseInfo(title = "Java Fundamentals : The Java Language",courseID = "java_lang",)
        courses.set(course.courseID,course)

        course = CourseInfo("java_core","Java Fundamentals : The Core Platform")
        courses.set(course.courseID,course)


    }
}