package com.hci.homerun

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hci.homerun.databinding.FragmentRoomBinding

class RoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRoomBinding.inflate(inflater, container, false)
//      val binding =  inflater.inflate(R.layout.fragment_room, container, false)
        binding.roomText.text = arguments?.getString("roomName")
        return binding.root
    }
}