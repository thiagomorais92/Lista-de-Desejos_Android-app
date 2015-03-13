package thiago.com.br.listadedesejos.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import thiago.com.br.listadedesejos.R;
import thiago.com.br.listadedesejos.model.Desejo;
import thiago.com.br.listadedesejos.util.ViewHolder;

/**
 * Created by Samsung on 12/03/2015.
 */
public class AdaptadorDeDesejos extends BaseAdapter {

    private final Context context;
    private final List<Desejo> desejos;

    public AdaptadorDeDesejos(Context context, List<Desejo> desejos) {
        this.context = context;
        this.desejos = desejos;
    }

    @Override
    public int getCount() {
        return desejos.size();
    }

    @Override
    public Object getItem(int position) {
        return desejos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View mLinha = convertView;
        if(mLinha==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mLinha = inflater.inflate(R.layout.layout_do_desejo, parent);
            //config View Holder
            ViewHolder holder = new ViewHolder();
            holder.tvProduto = (TextView) mLinha.findViewById(R.id.tvDesejo);
            holder.tvCategoria = (TextView) mLinha.findViewById(R.id.tvCategoria);
            holder.tvLojas = (TextView) mLinha.findViewById(R.id.tvLojas);
            holder.tvPrecoMaximo = (TextView) mLinha.findViewById(R.id.tvPrecoMaximo);
            holder.tvPrecoMinimo = (TextView) mLinha.findViewById(R.id.tvPrecoMinimo);
            mLinha.setTag(holder);
        }
            ViewHolder holder = (ViewHolder) mLinha.getTag();
            Desejo desejo = desejos.get(position);
                holder.tvProduto.setText(desejo.getProduto());
                holder.tvCategoria.setText(desejo.getCategoria());
                holder.tvLojas.setText(desejo.getLojas());
                holder.tvPrecoMinimo.setText(String.valueOf(desejo.getPrecoMinimo()));
                holder.tvPrecoMaximo.setText(String.valueOf(desejo.getPrecoMaximo()));

        return mLinha;
    }
}
