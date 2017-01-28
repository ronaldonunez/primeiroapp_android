package br.pucminas.rnunez.primeiroapp.exemplo5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.pucminas.rnunez.primeiroapp.R;

public class AdapterPlanets extends BaseAdapter {

    private final Context context;
    private final List<Planet> planets;

    public AdapterPlanets(Context context, List<Planet> planets){
        this.context = context;
        this.planets = planets;
    }

    @Override
    public int getCount() {
        return planets != null ? planets.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return planets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.planets, parent, false);

        TextView txtPlanet = (TextView) view.findViewById(R.id.txtPlanet);
        ImageView imgPlanet = (ImageView) view.findViewById(R.id.imgPlanet);

        Planet planet = planets.get(position);
        txtPlanet.setText(planet.getName());
        imgPlanet.setImageResource(planet.getImage());

        return view;
    }
}
