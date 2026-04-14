package com.example.innobridge.mahasiswa

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.innobridge.R

class PortfolioFragment : Fragment(R.layout.fragment_portfolio) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvPortfolio: RecyclerView = view.findViewById(R.id.rvPortfolio)

        val dummyData = listOf(
            Proposal("AI Education", "Platform belajar AI", "Under Review"),
            Proposal("Green Energy", "Monitoring energi", "Accepted"),
            Proposal("Smart City App", "Aplikasi kota pintar", "Rejected")
        )

        rvPortfolio.layoutManager = LinearLayoutManager(requireContext())
        rvPortfolio.adapter = PortfolioAdapter(dummyData)
    }
}