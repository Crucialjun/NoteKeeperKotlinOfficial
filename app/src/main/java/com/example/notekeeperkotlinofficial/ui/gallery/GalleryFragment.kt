package com.example.notekeeperkotlinofficial.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.notekeeperkotlinofficial.DataManager
import com.example.notekeeperkotlinofficial.R
import com.jwhh.notekeeper.CourseRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_gallery.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        listCourses.layoutManager = GridLayoutManager(requireContext(),2)
        listCourses.adapter = CourseRecyclerAdapter(requireContext(),DataManager.courses.values.toList())
    }


}