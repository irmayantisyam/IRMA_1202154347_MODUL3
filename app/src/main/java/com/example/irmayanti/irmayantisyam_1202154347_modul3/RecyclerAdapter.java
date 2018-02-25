package com.example.irmayanti.irmayantisyam_1202154347_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListTitle, arrayListDesc;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesc = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Title, Desc;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_product, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String title = arrayListTitle.get(position);
        final String desc = arrayListDesc.get(position);
        final Integer gambar = arrayListGambar.get(position);
        holder.Title.setText(title);
        holder.Desc.setText(desc);
        holder.Gambar.setImageResource(gambar);

        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), detailActivity.class);
                String descs = "    Air minum mineral dalam kemasan botol yang akan memberikan banyak manfaat untuk tubuh. HAl ini tentunya memberikan beberapa sudut pandang yang baik bagi para masyarakat yang menjaga kesehatannya \n" +
                        "        Untuk itu, kami sebagai pengola air mineral terbaik di Indonesia memberikan sedikit ulasan mengenai produk-produk air mineral dalam negeri \n" +
                        "Banyak masyarakat yang belum tau mengenai pentingnya menjaga kesehatan dengan mengonsumsi minimal 8 gelar air perhati. Untuk itu melalui aplikasi ini akan diulas pentingnya mengonsumsi air mineral yang bersih dan aman untuk tubuh \n" +
                        "\n" +
                        "   Air minum juga ternyata dapat memberikan efek awet muda, mudah menurunkan berat badan, pintar dan mampu fokus lebih dalam kelas. sehingga tidak ada salahnya untuk mengonsumsi air mineral sebanyak 8 gelas perhari. Mari kita sukseskan budaya mengonsumsi air mineral untuk selalu menjaga kesehatan dan kebugaran badan kita. Kalau bukan kita, siapa lagi? Kalau bukan sekarang, kapan lagi? Mari gengs!!! \n";
                //membuat pengkondisian
                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }
}
