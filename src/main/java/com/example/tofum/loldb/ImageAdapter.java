package com.example.tofum.loldb;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater inflater;

    public Integer[] championOriginalPortrait = {
            R.drawable.aatrox_0, R.drawable.ahri_0,
            R.drawable.akali_0, R.drawable.alistar_0,
            R.drawable.amumu_0, R.drawable.anivia_0,
            R.drawable.annie_0, R.drawable.ashe_0,
            R.drawable.aurelionsol_0, R.drawable.azir_0,
            R.drawable.bard_0, R.drawable.blitzcrank_0,
            R.drawable.brand_0, R.drawable.braum_0,
            R.drawable.caitlyn_0, R.drawable.cassiopeia_0,
            R.drawable.chogath_0, R.drawable.corki_0,
            R.drawable.darius_0, R.drawable.diana_0,
            R.drawable.draven_0, R.drawable.drmundo_0,
            R.drawable.ekko_0, R.drawable.elise_0,
            R.drawable.evelynn_0, R.drawable.ezreal_0,
            R.drawable.fiddlesticks_0, R.drawable.fiora_0,
            R.drawable.fizz_0, R.drawable.galio_0,
            R.drawable.gangplank_0, R.drawable.garen_0,
            R.drawable.gnar_0, R.drawable.gragas_0,
            R.drawable.graves_0, R.drawable.hecarim_0,
            R.drawable.heimerdinger_0, R.drawable.illaoi_0,
            R.drawable.irelia_0, R.drawable.janna_0,
            R.drawable.jarvaniv_0, R.drawable.jax_0,
            R.drawable.jayce_0, R.drawable.jhin_0,
            R.drawable.jinx_0, R.drawable.kalista_0,
            R.drawable.karma_0, R.drawable.karthus_0,
            R.drawable.kassadin_0, R.drawable.katarina_0,
            R.drawable.kayle_0, R.drawable.kennen_0,
            R.drawable.khazix_0, R.drawable.kindred_0,
            R.drawable.kled_0, R.drawable.kogmaw_0,
            R.drawable.leblanc_0, R.drawable.leesin_0,
            R.drawable.leona_0, R.drawable.lissandra_0,
            R.drawable.lucian_0, R.drawable.lulu_0,
            R.drawable.lux_0, R.drawable.malphite_0,
            R.drawable.malzahar_0, R.drawable.maokai_0,
            R.drawable.masteryi_0, R.drawable.missfortune_0,
            R.drawable.monkeyking_0, R.drawable.mordekaiser_0,
            R.drawable.morgana_0, R.drawable.nami_0,
            R.drawable.nasus_0, R.drawable.nautilus_0,
            R.drawable.nidalee_0, R.drawable.nocturne_0,
            R.drawable.nunu_0, R.drawable.olaf_0,
            R.drawable.orianna_0, R.drawable.pantheon_0,
            R.drawable.poppy_0, R.drawable.quinn_0,
            R.drawable.rammus_0, R.drawable.reksai_0,
            R.drawable.renekton_0, R.drawable.rengar_0,
            R.drawable.riven_0, R.drawable.rumble_0,
            R.drawable.ryze_0, R.drawable.sejuani_0,
            R.drawable.shaco_0, R.drawable.shen_0,
            R.drawable.shyvana_0, R.drawable.singed_0,
            R.drawable.sion_0, R.drawable.sivir_0,
            R.drawable.skarner_0, R.drawable.sona_0,
            R.drawable.soraka_0, R.drawable.swain_0,
            R.drawable.syndra_0, R.drawable.tahmkench_0,
            R.drawable.taliyah_0,
            R.drawable.talon_0, R.drawable.taric_0,
            R.drawable.teemo_0, R.drawable.thresh_0,
            R.drawable.tristana_0, R.drawable.trundle_0,
            R.drawable.tryndamere_0, R.drawable.twistedfate_0,
            R.drawable.twitch_0, R.drawable.udyr_0,
            R.drawable.urgot_0, R.drawable.varus_0,
            R.drawable.vayne_0, R.drawable.veigar_0,
            R.drawable.velkoz_0, R.drawable.viktor_0,
            R.drawable.vi_0, R.drawable.vladimir_0,
            R.drawable.volibear_0, R.drawable.warwick_0,
            R.drawable.xerath_0, R.drawable.xinzhao_0,
            R.drawable.yasuo_0, R.drawable.yorick_0,
            R.drawable.zac_0, R.drawable.zed_0,
            R.drawable.ziggs_0, R.drawable.zilean_0,
            R.drawable.zyra_0,

    };

    public ImageAdapter(Context c){
        mContext = c;
        inflater = LayoutInflater.from(mContext);
    }

    public int getCount() {
        return championOriginalPortrait.length;
    }

    public Object getItem(int position) {
        return championOriginalPortrait[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView = (ImageView) convertView;
//
//        if (imageView == null) {
//            imageView = new ImageView(mContext);
//            //Picasso.with(mContext).load(championOriginalPortrait[position]).centerInside().placeholder(championOriginalPortrait[0]).fit().tag(mContext).into(imageView);
//
//        }
//
//        Picasso.with(mContext)
//                .load(championOriginalPortrait[position])
//                .centerInside()
//                .placeholder(R.drawable.champion_placeholder)
//                .error(R.drawable.champion_placeholder)
//                .fit()
//                .tag(mContext)
//                .into(imageView);
//
//        return imageView;
        ImageView img;
        if (convertView == null) {
            img = new ImageView(mContext);
            convertView = img;
        } else {
            img = (ImageView) convertView;
        }

        Picasso
                .with(mContext)
                .load(championOriginalPortrait[position])
                .centerInside()
                .placeholder(R.drawable.champion_placeholder)
                //.fit()
                .resize(150,250)
                .tag(mContext)
                .into(img);

        return convertView;
    }

}