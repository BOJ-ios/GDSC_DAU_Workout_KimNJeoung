package com.example.workout.ui.workout

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.workout.R
import com.example.workout.simple_bluetooth_le_terminal.BluetoothActivity

class WorkoutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_workout, container, false)
        val startButton : Button = view.findViewById(R.id.start_btn)
        startButton.setOnClickListener {
            val intent = Intent(activity, BluetoothActivity::class.java)
            startActivity(intent)
        }
        return view
    }
    override fun onResume() {
        super.onResume()
    }
    override fun onDestroyView() {
        super.onDestroyView()
    }
}