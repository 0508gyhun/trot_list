package com.example.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_singer3,container,false)

        val items = mutableListOf<String>()
        items.add("사랑가")
        items.add("송가인임요")
        items.add("가인 시대")
        items.add("이제 나만 믿어용")
        items.add("별빛 같은 나의 사람")
        items.add("아실까요")
        items.add("영웅 시대")
        items.add("이제 나만 믿어용")
        items.add("별빛 같은 나의 사람")
        items.add("아실까요")
        items.add("영웅 시대")
        items.add("이제 나만 믿어용")




        val rv = view.findViewById<RecyclerView>(R.id.singRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener{
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment
            )

        }
        view.findViewById<ImageView>(R.id.image2).setOnClickListener{
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment
            )
        }
        // Inflate the layout for this fragment
        return view
    }



}