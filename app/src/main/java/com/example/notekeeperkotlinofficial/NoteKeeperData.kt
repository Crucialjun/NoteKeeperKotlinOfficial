package com.example.notekeeperkotlinofficial

class CourseInfo(val courseID : String, val title : String) {
    override fun toString(): String {
        return title
    }
}

class NoteInfo(var course:CourseInfo,var title:String,var text :String)