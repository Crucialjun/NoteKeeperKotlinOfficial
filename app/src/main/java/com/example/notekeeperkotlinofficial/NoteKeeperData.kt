package com.example.notekeeperkotlinofficial

data class CourseInfo(val courseID : String, val title : String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo(var course:CourseInfo,var title:String,var text :String)