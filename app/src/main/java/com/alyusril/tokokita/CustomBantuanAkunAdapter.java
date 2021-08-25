package com.alyusril.tokokita;

import android.content.Context;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomBantuanAkunAdapter extends RecyclerView.Adapter<CustomBantuanAkunAdapter.ViewHolder>{

    private Context context;
    private List<CustomBantuanAkun> bantuanAkunList;

    public CustomBantuanAkunAdapter(Context context, List<CustomBantuanAkun> bantuanAkunList) {
        this.context = context;
        this.bantuanAkunList = bantuanAkunList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_isi_bantuan_akun,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomBantuanAkunAdapter.ViewHolder holder, int position) {
        final CustomBantuanAkun customBantuanAkun = bantuanAkunList.get(position);
        holder.tvVisible.setText(customBantuanAkun.getVisible());
        holder.tvGone.setText(customBantuanAkun.getGone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.cvIsi.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(holder.cvExp, new AutoTransition());
                    holder.cvIsi.setVisibility(View.VISIBLE);
                    holder.arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(holder.cvExp,new AutoTransition());
                    holder.cvIsi.setVisibility(View.GONE);
                    holder.arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return bantuanAkunList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvVisible, tvGone;
        ImageView arrow;
        CardView cvIsi, cvExp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvVisible = itemView.findViewById(R.id.isiTextVisible);
            tvGone = itemView.findViewById(R.id.isiTextGone);

            cvExp = itemView.findViewById(R.id.cvExpAkun1);
            cvIsi = itemView.findViewById(R.id.cvIsiAkun1);
            arrow = itemView.findViewById(R.id.arrowAkun);
        }
    }
}
