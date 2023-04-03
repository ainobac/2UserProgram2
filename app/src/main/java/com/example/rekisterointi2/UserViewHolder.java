package com.example.rekisterointi2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView userName, userAla, userEmail, userDegree;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        userName = itemView.findViewById(R.id.textViewName);
        userAla = itemView.findViewById(R.id.textViewAla);
        userEmail = itemView.findViewById(R.id.textViewEmail);
        userDegree = itemView.findViewById(R.id.textViewDegrees);
    }
}