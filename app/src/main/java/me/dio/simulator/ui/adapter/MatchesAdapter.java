package me.dio.simulator.ui.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import me.dio.simulator.databinding.MatchItemBinding;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder>  {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final MatchItemBinding binding;

        public ViewHolder(MatchItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }






}
