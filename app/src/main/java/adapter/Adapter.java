package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.andradeclayton.meucardcomrecyclerview.R;

import java.util.List;

import modelo.Item_card;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder>{

    Context mContext;
    List<Item_card> mData;

    public Adapter(Context mContext, List<Item_card> mData){
        this.mContext = mContext;
        this.mData    = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View v = layoutInflater.inflate(R.layout.card_item, parent, false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.foto_perfil.setImageResource(mData.get(position).getFoto_perfil());
        holder.tv_titulo.setText(mData.get(position).getNome_perfil());
        holder.tv_card_sub_titulo.setText(mData.get(position).getSeguidores() + " Seguidores");

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView foto_perfil;
        ImageView background_img;
        TextView tv_titulo;
        TextView tv_card_sub_titulo;

        public myViewHolder(View itemView){
            super(itemView);

            foto_perfil        = itemView.findViewById(R.id.img_perfil);
            background_img     = itemView.findViewById(R.id.card_background);
            tv_titulo          = itemView.findViewById(R.id.tv_titulo);
            tv_card_sub_titulo = itemView.findViewById(R.id.tv_card_sub_titulo);
        }
    }
}
