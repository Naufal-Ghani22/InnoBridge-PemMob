package com.example.innobridge.mahasiswa

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.innobridge.R

class SubmissionFragment : Fragment(R.layout.fragment_submission) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etJudul: EditText = view.findViewById(R.id.etJudul)
        val etDeskripsi: EditText = view.findViewById(R.id.etDeskripsi)
        val etLink: EditText = view.findViewById(R.id.etLink)
        val btnSubmit: Button = view.findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {

            val judul = etJudul.text.toString()
            val deskripsi = etDeskripsi.text.toString()
            val link = etLink.text.toString()

            if (judul.isEmpty() || deskripsi.isEmpty() || link.isEmpty()) {
                Toast.makeText(requireContext(), "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                // Simulasi submit (Sprint awal)
                Toast.makeText(requireContext(), "Proposal berhasil dikirim 🚀", Toast.LENGTH_SHORT).show()

                // Clear input
                etJudul.text.clear()
                etDeskripsi.text.clear()
                etLink.text.clear()
            }
        }
    }
}