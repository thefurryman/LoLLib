package com.example.tofum.loldb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.lang.ref.WeakReference;

/**
 * Created by tofum on 9/1/2016.
 */

public class AbilityImageAdapter extends BaseAdapter {
    private Context context;
    private int position;
    private Integer[] images;
    private String[] abilityName;
    private String[] abilityDesc;

    private Integer[] defaultI = {

    };

    private Integer[] aatrox = {
            R.drawable.aatrox_passive, R.drawable.aatrox_q,
            R.drawable.aatrox_w1, R.drawable.aatrox_w2,
            R.drawable.aatrox_e, R.drawable.aatrox_r,
    };

    private Integer[] ahri = {
            R.drawable.ahri_passive, R.drawable.ahri_q,
            R.drawable.ahri_w, R.drawable.ahri_e,
            R.drawable.ahri_r,
    };

    private Integer[] akali = {
            R.drawable.akali_passive, R.drawable.akali_q,
            R.drawable.akali_w, R.drawable.akali_e,
            R.drawable.akali_r,
    };

    private Integer[] alistar = {
            R.drawable.alistar_passive, R.drawable.alistar_q,
            R.drawable.alistar_w, R.drawable.alistar_e,
            R.drawable.alistar_r,
    };

    //

    private Integer[] amumu = {
            R.drawable.amumu_passive, R.drawable.amumu_q,
            R.drawable.amumu_w, R.drawable.amumu_e,
            R.drawable.amumu_r
    };
    private Integer[] anivia = {
            R.drawable.anivia_passive, R.drawable.anivia_q,
            R.drawable.anivia_w, R.drawable.anivia_e,
            R.drawable.anivia_r
    };
    private Integer[] annie = {
            R.drawable.annie_passive, R.drawable.annie_q,
            R.drawable.annie_w, R.drawable.annie_w,
            R.drawable.annie_r
    };
    private Integer[] ashe = {
            R.drawable.ashe_passive, R.drawable.ashe_q,
            R.drawable.ashe_w, R.drawable.ashe_e,
            R.drawable.ashe_r
    };
    private Integer[] aurelionsol = {
            R.drawable.aurelionsol_passive, R.drawable.aurelionsol_q,
            R.drawable.aurelionsol_w_starsin, R.drawable.aurelionsol_w_starsout,
            R.drawable.aurelionsol_e_fly, R.drawable.aurelionsol_r
    };
    private Integer[] azir = {
            R.drawable.azir_passive, R.drawable.azir_q,
            R.drawable.azir_w, R.drawable.azir_e,
            R.drawable.azir_r
    };
    private Integer[] bard = {
            R.drawable.bard_passive, R.drawable.bard_q,
            R.drawable.bard_w, R.drawable.bard_e,
            R.drawable.bard_r
    };
    private Integer[] blitzcrank = {
            R.drawable.blitzcrank_passive, R.drawable.blitzcrank_q,
            R.drawable.blitzcrank_w, R.drawable.blitzcrank_e,
            R.drawable.blitzcrank_r
    };
    private Integer[] brand = {
            R.drawable.brand_passive, R.drawable.brand_q,
            R.drawable.brand_w, R.drawable.brand_e,
            R.drawable.brand_r
    };
    private Integer[] braum = {
            R.drawable.braum_passive, R.drawable.braum_q,
            R.drawable.braum_w, R.drawable.braum_e,
            R.drawable.braum_r
    };
    private Integer[] caitlyn = {
            R.drawable.caitlyn_passive, R.drawable.caitlyn_q,
            R.drawable.caitlyn_w, R.drawable.caitlyn_e,
            R.drawable.caitlyn_r
    };
    private Integer[] cassiopeia = {
            R.drawable.cassiopeia_passive, R.drawable.cassiopeia_q,
            R.drawable.cassiopeia_w, R.drawable.cassiopeia_e,
            R.drawable.cassiopeia_r
    };

    private Integer[] chogath = {
            R.drawable.chogath_passive, R.drawable.chogath_q,
            R.drawable.chogath_w, R.drawable.chogath_e,
            R.drawable.chogath_r
    };
    private Integer[] corki = {
            R.drawable.corki_passive, R.drawable.corki_q,
            R.drawable.corki_w, R.drawable.corki_e,
            R.drawable.corki_r
    };
    private Integer[] darius = {
            R.drawable.darius_passive, R.drawable.darius_q,
            R.drawable.darius_w, R.drawable.darius_e,
            R.drawable.darius_r
    };
    private Integer[] diana = {
            R.drawable.diana_passive, R.drawable.diana_q,
            R.drawable.diana_w, R.drawable.diana_e,
            R.drawable.diana_r
    };
    private Integer[] draven = {
            R.drawable.draven_passive, R.drawable.draven_q,
            R.drawable.draven_w, R.drawable.draven_e,
            R.drawable.draven_r
    };
    private Integer[] drmundo = {
            R.drawable.drmundo_passive, R.drawable.drmundo_q,
            R.drawable.drmundo_w, R.drawable.drmundo_e,
            R.drawable.drmundo_r
    };
    private Integer[] ekko = {
            R.drawable.ekko_passive, R.drawable.ekko_q,
            R.drawable.ekko_w, R.drawable.ekko_e,
            R.drawable.ekko_r
    };
    private Integer[] elise = {
            R.drawable.elise_passive, R.drawable.elise_q1,R.drawable.elise_q2,
            R.drawable.elise_w1, R.drawable.elise_w2,
            R.drawable.elise_e1,R.drawable.elise_e2,
            R.drawable.elise_r
    };
    private Integer[] evelynn = {
            R.drawable.evelynn_passive, R.drawable.evelynn_q,
            R.drawable.evelynn_w, R.drawable.evelynn_e,
            R.drawable.evelynn_r
    };
    private Integer[] ezreal = {
            R.drawable.ezreal_passive, R.drawable.ezreal_q,
            R.drawable.ezreal_w, R.drawable.ezreal_e,
            R.drawable.ezreal_r
    };
    private Integer[] fiddlesticks = {
            R.drawable.fiddlesticks_passive, R.drawable.fiddlesticks_q,
            R.drawable.fiddlesticks_w, R.drawable.fiddlesticks_e,
            R.drawable.fiddlesticks_r
    };
    private Integer[] fiora = {
            R.drawable.fiora_passive, R.drawable.fiora_q,
            R.drawable.fiora_w, R.drawable.fiora_e,
            R.drawable.fiora_r
    };
    private Integer[] fizz = {
            R.drawable.fizz_passive, R.drawable.fizz_q,
            R.drawable.fizz_w, R.drawable.fizz_e1, R.drawable.fizz_e2,
            R.drawable.fizz_r
    };
    private Integer[] galio = {
            R.drawable.galio_passive, R.drawable.galio_q,
            R.drawable.galio_w, R.drawable.galio_e,
            R.drawable.galio_r
    };
    private Integer[] gangplank = {
            R.drawable.gangplank_passive, R.drawable.gangplank_q,
            R.drawable.gangplank_w, R.drawable.gangplank_e,
            R.drawable.gangplank_r
    };
    private Integer[] garen = {
            R.drawable.garen_passive, R.drawable.garen_q,
            R.drawable.garen_w, R.drawable.garen_e1,
            R.drawable.garen_r
    };
    private Integer[] gnar = {
            R.drawable.gnar_passive, R.drawable.gnar_q,
            R.drawable.gnar_w, R.drawable.gnar_e,
            R.drawable.gnar_r
    };
    private Integer[] gragas = {
            R.drawable.gragas_passive, R.drawable.gragas_q,
            R.drawable.gragas_w, R.drawable.gragas_e,
            R.drawable.gragas_r
    };
    private Integer[] graves = {
            R.drawable.graves_passive, R.drawable.graves_q,
            R.drawable.graves_w, R.drawable.graves_e,
            R.drawable.graves_r
    };
    private Integer[] hecarim = {
            R.drawable.hecarim_passive, R.drawable.hecarim_q,
            R.drawable.hecarim_w, R.drawable.hecarim_e,
            R.drawable.hecarim_r
    };
    private Integer[] heimerdinger = {
            R.drawable.heimerdinger_passive, R.drawable.heimerdinger_q1, R.drawable.heimerdinger_q2,
            R.drawable.heimerdinger_w1, R.drawable.heimerdinger_w2,
            R.drawable.heimerdinger_e1, R.drawable.heimerdinger_e2,
            R.drawable.heimerdinger_r
    };
    private Integer[] illaoi = {
            R.drawable.illaoi_passive, R.drawable.illaoi_q,
            R.drawable.illaoi_w, R.drawable.illaoi_e,
            R.drawable.illaoi_r
    };
    private Integer[] irelia = {
            R.drawable.irelia_passive, R.drawable.irelia_q,
            R.drawable.irelia_w, R.drawable.irelia_e,
            R.drawable.irelia_r
    };
    private Integer[] janna = {
            R.drawable.janna_passive, R.drawable.janna_q,
            R.drawable.janna_w, R.drawable.janna_e,
            R.drawable.janna_r
    };
    private Integer[] jarvaniv = {
            R.drawable.jarvaniv_passive, R.drawable.jarvaniv_q,
            R.drawable.jarvaniv_w, R.drawable.jarvaniv_e,
            R.drawable.jarvaniv_r
    };
    private Integer[] jax = {
            R.drawable.jax_passive, R.drawable.jax_q,
            R.drawable.jax_w, R.drawable.jax_e,
            R.drawable.jax_r
    };
    private Integer[] jayce = {
            R.drawable.jayce_passive, R.drawable.jayce_q1,R.drawable.jayce_q2,
            R.drawable.jayce_w1, R.drawable.jayce_w2,
            R.drawable.jayce_e1, R.drawable.jayce_e2,
            R.drawable.jayce_r1, R.drawable.jayce_r2,
    };
    private Integer[] jhin = {
            R.drawable.jhin_p, R.drawable.jhin_q,
            R.drawable.jhin_w, R.drawable.jhin_e,
            R.drawable.jhin_r
    };
    private Integer[] jinx = {
            R.drawable.jinx_passive,
            R.drawable.jinx_q1, R.drawable.jinx_q2,
            R.drawable.jinx_w, R.drawable.jinx_e,
            R.drawable.jinx_r
    };
    private Integer[] kalista = {
            R.drawable.kalista_passive, R.drawable.kalista_q,
            R.drawable.kalista_w, R.drawable.kalista_e,
            R.drawable.kalista_r
    };
    private Integer[] karma = {
            R.drawable.karma_passive,
            R.drawable.karma_q1, R.drawable.karma_q2,
            R.drawable.karma_w1, R.drawable.karma_w2,
            R.drawable.karma_e1, R.drawable.karma_e2,
            R.drawable.karma_r
    };
    private Integer[] karthus = {
            R.drawable.karthus_passive, R.drawable.karthus_q,
            R.drawable.karthus_w, R.drawable.karthus_e,
            R.drawable.karthus_r
    };
    private Integer[] kassadin = {
            R.drawable.kassadin_passive, R.drawable.kassadin_q,
            R.drawable.kassadin_w, R.drawable.kassadin_e,
            R.drawable.kassadin_r
    };
    private Integer[] katarina = {
            R.drawable.katarina_passive, R.drawable.katarina_q,
            R.drawable.katarina_w, R.drawable.katarina_e,
            R.drawable.katarina_r
    };
    private Integer[] kayle = {
            R.drawable.kayle_passive, R.drawable.kayle_q,
            R.drawable.kayle_w, R.drawable.kayle_e,
            R.drawable.kayle_r
    };
    private Integer[] kennen = {
            R.drawable.kennen_passive, R.drawable.kennen_q,
            R.drawable.kennen_w, R.drawable.kennen_e,
            R.drawable.kennen_r
    };
    private Integer[] khazix = {
            R.drawable.khazix_p, R.drawable.khazix_q,
            R.drawable.khazix_w, R.drawable.khazix_e,
            R.drawable.khazix_r
    };
    private Integer[] kindred = {
            R.drawable.kindred_passive, R.drawable.kindred_q,
            R.drawable.kindred_w, R.drawable.kindred_e,
            R.drawable.kindred_r
    };
    private Integer[] kled = {
            R.drawable.kled_p,
            R.drawable.kled_q1, R.drawable.kled_q2,
            R.drawable.kled_w,
            R.drawable.kled_e1, R.drawable.kled_e2,
            R.drawable.kled_r
    };
    private Integer[] kogmaw = {
            R.drawable.kogmaw_passive, R.drawable.kogmaw_q,
            R.drawable.kogmaw_w, R.drawable.kogmaw_e,
            R.drawable.kogmaw_r
    };
    private Integer[] leblanc = {
            R.drawable.leblanc_passive, R.drawable.leblanc_q,
            R.drawable.leblanc_w, R.drawable.leblanc_e,
            R.drawable.leblanc_r
    };
    private Integer[] leesin = {
            R.drawable.leesin_passive,
            R.drawable.leesin_q1,R.drawable.leesin_q2,
            R.drawable.leesin_w1, R.drawable.leesin_w2,
            R.drawable.leesin_e1, R.drawable.leesin_e2,
            R.drawable.leesin_r
    };
    private Integer[] leona = {
            R.drawable.leona_passive, R.drawable.leona_q,
            R.drawable.leona_w, R.drawable.leona_e,
            R.drawable.leona_r
    };
    private Integer[] lissandra = {
            R.drawable.lissandra_passive, R.drawable.lissandra_q,
            R.drawable.lissandra_w, R.drawable.lissandra_e,
            R.drawable.lissandra_r
    };
    private Integer[] lucian = {
            R.drawable.lucian_passive, R.drawable.lucian_q,
            R.drawable.lucian_w, R.drawable.lucian_e,
            R.drawable.lucian_r
    };
    private Integer[] lulu = {
            R.drawable.lulu_passive, R.drawable.lulu_q,
            R.drawable.lulu_w, R.drawable.lulu_e,
            R.drawable.lulu_r
    };
    private Integer[] lux = {
            R.drawable.lux_passive, R.drawable.lux_q,
            R.drawable.lux_w, R.drawable.lux_e,
            R.drawable.lux_r
    };
    private Integer[] malphite = {
            R.drawable.malphite_passive, R.drawable.malphite_q,
            R.drawable.malphite_w, R.drawable.malphite_e,
            R.drawable.malphite_r
    };
    private Integer[] malzahar = {
            R.drawable.malzahar_passive, R.drawable.malzahar_q,
            R.drawable.malzahar_w, R.drawable.malzahar_e,
            R.drawable.malzahar_r
    };
    private Integer[] maokai = {
            R.drawable.maokai_passive, R.drawable.maokai_q,
            R.drawable.maokai_w, R.drawable.maokai_e,
            R.drawable.maokai_r
    };
    private Integer[] masteryi = {
            R.drawable.masteryi_passive1, R.drawable.masteryi_q,
            R.drawable.masteryi_w,
            R.drawable.masteryi_e1, R.drawable.masteryi_e2,
            R.drawable.masteryi_r
    };
    private Integer[] missfortune = {
            R.drawable.missfortune_passive, R.drawable.missfortune_q,
            R.drawable.missfortune_w, R.drawable.missfortune_e,
            R.drawable.missfortune_r
    };
    private Integer[] monkeyking = {
            R.drawable.monkeyking_passive, R.drawable.monkeyking_q,
            R.drawable.monkeyking_w, R.drawable.monkeyking_e,
            R.drawable.monkeyking_r
    };
    private Integer[] mordekaiser = {
            R.drawable.mordekaiser_passive, R.drawable.mordekaiser_q,
            R.drawable.mordekaiser_w, R.drawable.mordekaiser_e,
            R.drawable.mordekaiser_r
    };
    private Integer[] morgana = {
            R.drawable.morgana_passive, R.drawable.morgana_q,
            R.drawable.morgana_w, R.drawable.morgana_e,
            R.drawable.morgana_r
    };
    private Integer[] nami = {
            R.drawable.nami_passive, R.drawable.nami_q,
            R.drawable.nami_w, R.drawable.nami_e,
            R.drawable.nami_r
    };
    private Integer[] nasus = {
            R.drawable.nasus_passive, R.drawable.nasus_q,
            R.drawable.nasus_w, R.drawable.nasus_e,
            R.drawable.nasus_r
    };
    private Integer[] nautilus = {
            R.drawable.nautilus_passive, R.drawable.nautilus_q,
            R.drawable.nautilus_w, R.drawable.nautilus_e,
            R.drawable.nautilus_r
    };
    private Integer[] nidalee = {
            R.drawable.nidalee_passive,
            R.drawable.nidalee_q1, R.drawable.nidalee_q2,
            R.drawable.nidalee_w1, R.drawable.nidalee_w2,
            R.drawable.nidalee_e1, R.drawable.nidalee_e2,
            R.drawable.nidalee_r1, R.drawable.nidalee_r2
    };
    private Integer[] nocturne = {
            R.drawable.nocturne_passive, R.drawable.nocturne_q,
            R.drawable.nocturne_w, R.drawable.nocturne_e,
            R.drawable.nocturne_r
    };
    private Integer[] nunu = {
            R.drawable.nunu_passive, R.drawable.nunu_q,
            R.drawable.nunu_w, R.drawable.nunu_e,
            R.drawable.nunu_r
    };
    private Integer[] olaf = {
            R.drawable.olaf_passive, R.drawable.olaf_q,
            R.drawable.olaf_w, R.drawable.olaf_e,
            R.drawable.olaf_r
    };
    private Integer[] orianna = {
            R.drawable.orianna_passive1, R.drawable.orianna_passive2,
            R.drawable.orianna_q,
            R.drawable.orianna_w, R.drawable.orianna_e,
            R.drawable.orianna_r
    };
    private Integer[] pantheon = {
            R.drawable.pantheon_passive, R.drawable.pantheon_q,
            R.drawable.pantheon_w,
            R.drawable.pantheon_e1, R.drawable.pantheon_e2,
            R.drawable.pantheon_r
    };
    private Integer[] poppy = {
            R.drawable.poppy_passive, R.drawable.poppy_q,
            R.drawable.poppy_w, R.drawable.poppy_e,
            R.drawable.poppy_r
    };
    private Integer[] quinn = {
            R.drawable.quinn_passive, R.drawable.quinn_q,
            R.drawable.quinn_w, R.drawable.quinn_e,
            R.drawable.quinn_r1, R.drawable.quinn_r2
    };
    private Integer[] rammus = {
            R.drawable.rammus_passive, R.drawable.rammus_q,
            R.drawable.rammus_w, R.drawable.rammus_e,
            R.drawable.rammus_r
    };
    private Integer[] reksai = {
            R.drawable.reksai_passive,
            R.drawable.reksai_q1,R.drawable.reksai_q2,
            R.drawable.reksai_w1, R.drawable.reksai_w2,
            R.drawable.reksai_e1, R.drawable.reksai_e2,
            R.drawable.reksai_r
    };
    private Integer[] renekton = {
            R.drawable.renekton_passive, R.drawable.renekton_q,
            R.drawable.renekton_w, R.drawable.renekton_e,
            R.drawable.renekton_r
    };
    private Integer[] rengar = {
            R.drawable.rengar_passive,
            R.drawable.rengar_q1, R.drawable.rengar_q2,
            R.drawable.rengar_w1, R.drawable.rengar_w2,
            R.drawable.rengar_e1, R.drawable.rengar_e2,
            R.drawable.rengar_r
    };
    private Integer[] riven = {
            R.drawable.riven_passive, R.drawable.riven_q,
            R.drawable.riven_w, R.drawable.riven_e,
            R.drawable.riven_r1, R.drawable.riven_r2
    };
    private Integer[] rumble = {
            R.drawable.rumble_passive1, R.drawable.rumble_q,
            R.drawable.rumble_w, R.drawable.rumble_e,
            R.drawable.rumble_r
    };
    private Integer[] ryze = {
            R.drawable.ryze_p, R.drawable.ryze_q,
            R.drawable.ryze_w, R.drawable.ryze_e,
            R.drawable.ryze_r
    };
    private Integer[] sejuani = {
            R.drawable.sejuani_passive, R.drawable.sejuani_q,
            R.drawable.sejuani_w, R.drawable.sejuani_e,
            R.drawable.sejuani_r
    };
    private Integer[] shaco = {
            R.drawable.shaco_passive, R.drawable.shaco_q,
            R.drawable.shaco_w, R.drawable.shaco_e,
            R.drawable.shaco_r
    };
    private Integer[] shen = {
            R.drawable.shen_passive, R.drawable.shen_q,
            R.drawable.shen_w, R.drawable.shen_e,
            R.drawable.shen_r
    };
    private Integer[] shyvana = {
            R.drawable.shyvana_passive, R.drawable.shyvana_q,
            R.drawable.shyvana_w, R.drawable.shyvana_e,
            R.drawable.shyvana_r
    };
    private Integer[] singed = {
            R.drawable.singed_passive, R.drawable.singed_q,
            R.drawable.singed_w, R.drawable.singed_e,
            R.drawable.singed_r
    };
    private Integer[] sion = {
            R.drawable.sion_passive1, R.drawable.sion_passive2,
            R.drawable.sion_q,
            R.drawable.sion_w1, R.drawable.sion_w2,
            R.drawable.sion_e,
            R.drawable.sion_r1, R.drawable.sion_r2
    };
    private Integer[] sivir = {
            R.drawable.sivir_passive, R.drawable.sivir_q,
            R.drawable.sivir_w, R.drawable.sivir_e,
            R.drawable.sivir_r
    };
    private Integer[] skarner = {
            R.drawable.skarner_passive, R.drawable.skarner_q,
            R.drawable.skarner_w, R.drawable.skarner_e,
            R.drawable.skarner_r
    };
    private Integer[] sona = {
            R.drawable.sona_passive_charged, R.drawable.sona_q,
            R.drawable.sona_w, R.drawable.sona_e,
            R.drawable.sona_r
    };
    private Integer[] soraka = {
            R.drawable.soraka_passive, R.drawable.soraka_q,
            R.drawable.soraka_w, R.drawable.soraka_e,
            R.drawable.soraka_r
    };
    private Integer[] swain = {
            R.drawable.swain_passive, R.drawable.swain_q,
            R.drawable.swain_w, R.drawable.swain_e,
            R.drawable.swain_r
    };
    private Integer[] syndra = {
            R.drawable.syndra_passive, R.drawable.syndra_q,
            R.drawable.syndra_w1, R.drawable.syndra_w2,
            R.drawable.syndra_e,
            R.drawable.syndra_r
    };
    private Integer[] tahmkench = {
            R.drawable.tahmkench_p, R.drawable.tahmkench_q,
            R.drawable.tahmkench_w1,R.drawable.tahmkench_w2,
            R.drawable.tahmkench_e,
            R.drawable.tahmkench_r1, R.drawable.tahmkench_r2
    };
    private Integer[] taliyah = {
            R.drawable.taliyah_passive, R.drawable.taliyah_q,
            R.drawable.taliyah_w, R.drawable.taliyah_e,
            R.drawable.taliyah_r
    };
    private Integer[] talon = {
            R.drawable.talon_passive, R.drawable.talon_q,
            R.drawable.talon_w, R.drawable.talon_e,
            R.drawable.talon_r
    };
    private Integer[] taric = {
            R.drawable.taric_passive, R.drawable.taric_q,
            R.drawable.taric_w, R.drawable.taric_e,
            R.drawable.taric_r
    };
    private Integer[] teemo = {
            R.drawable.teemo_passive1, R.drawable.teemo_passive2,
            R.drawable.teemo_q,
            R.drawable.teemo_w, R.drawable.teemo_e,
            R.drawable.teemo_r
    };
    private Integer[] thresh = {
            R.drawable.thresh_passive, R.drawable.thresh_q,
            R.drawable.thresh_w, R.drawable.thresh_e,
            R.drawable.thresh_r
    };
    private Integer[] tristana = {
            R.drawable.tristana_passive, R.drawable.tristana_q,
            R.drawable.tristana_w, R.drawable.tristana_e,
            R.drawable.tristana_r
    };
    private Integer[] trundle = {
            R.drawable.trundle_passive, R.drawable.trundle_q,
            R.drawable.trundle_w, R.drawable.trundle_e,
            R.drawable.trundle_r
    };
    private Integer[] tryndamere = {
            R.drawable.tryndamere_passive, R.drawable.tryndamere_q,
            R.drawable.tryndamere_w, R.drawable.tryndamere_e,
            R.drawable.tryndamere_r
    };
    private Integer[] twistedfate = {
            R.drawable.twistedfate_passive, R.drawable.twistedfate_q,
            R.drawable.twistedfate_w, R.drawable.twistedfate_e,
            R.drawable.twistedfate_r1, R.drawable.twistedfate_r2
    };
    private Integer[] twitch = {
            R.drawable.twitch_passive, R.drawable.twitch_q,
            R.drawable.twitch_w, R.drawable.twitch_e,
            R.drawable.twitch_r
    };
    private Integer[] udyr = {
            R.drawable.udyr_passive, R.drawable.udyr_q,
            R.drawable.udyr_w, R.drawable.udyr_e,
            R.drawable.udyr_r
    };
    private Integer[] urgot = {
            R.drawable.urgot_passive, R.drawable.urgot_q,
            R.drawable.urgot_w, R.drawable.urgot_e,
            R.drawable.urgot_r
    };
    private Integer[] varus = {
            R.drawable.varus_passive, R.drawable.varus_q,
            R.drawable.varus_w, R.drawable.varus_e,
            R.drawable.varus_r
    };
    private Integer[] vayne = {
            R.drawable.vayne_passive, R.drawable.vayne_q,
            R.drawable.vayne_w, R.drawable.vayne_e,
            R.drawable.vayne_r
    };
    private Integer[] veigar = {
            R.drawable.veigar_passive, R.drawable.veigar_q,
            R.drawable.veigar_w, R.drawable.veigar_e,
            R.drawable.veigar_r
    };
    private Integer[] velkoz = {
            R.drawable.velkoz_passive,
            R.drawable.velkoz_q1, R.drawable.velkoz_q2,
            R.drawable.velkoz_w, R.drawable.velkoz_e,
            R.drawable.velkoz_r
    };
    private Integer[] viktor = {
            R.drawable.viktor_passive,
            R.drawable.viktor_q1, R.drawable.viktor_q2,
            R.drawable.viktor_w1, R.drawable.viktor_w2,
            R.drawable.viktor_e1, R.drawable.viktor_e2,
            R.drawable.viktor_r
    };
    private Integer[] vi = {
            R.drawable.vi_passive, R.drawable.vi_q,
            R.drawable.vi_w,
            R.drawable.vi_e1, R.drawable.vi_e2,
            R.drawable.vi_r
    };
    private Integer[] vladimir = {
            R.drawable.vladimir_passive, R.drawable.vladimir_q,
            R.drawable.vladimir_w, R.drawable.vladimir_e,
            R.drawable.vladimir_r
    };
    private Integer[] volibear = {
            R.drawable.volibear_passive, R.drawable.volibear_q,
            R.drawable.volibear_w, R.drawable.volibear_e,
            R.drawable.volibear_r
    };
    private Integer[] warwick = {
            R.drawable.warwick_passive, R.drawable.warwick_q,
            R.drawable.warwick_w, R.drawable.warwick_e,
            R.drawable.warwick_r
    };
    private Integer[] xerath = {
            R.drawable.xerath_passive, R.drawable.xerath_q,
            R.drawable.xerath_w, R.drawable.xerath_e,
            R.drawable.xerath_r
    };
    private Integer[] xinzhao = {
            R.drawable.xinzhao_passive, R.drawable.xinzhao_q,
            R.drawable.xinzhao_w, R.drawable.xinzhao_e,
            R.drawable.xinzhao_r
    };
    private Integer[] yasuo = {
            R.drawable.yasuo_passive,
            R.drawable.yasuo_q1,
            R.drawable.yasuo_w, R.drawable.yasuo_e,
            R.drawable.yasuo_r
    };
    private Integer[] yorick = {
            R.drawable.yorick_passive,
            R.drawable.yorick_q1, R.drawable.yorick_q2,
            R.drawable.yorick_w, R.drawable.yorick_e,
            R.drawable.yorick_r
    };
    private Integer[] zac = {
            R.drawable.zac_passive, R.drawable.zac_q,
            R.drawable.zac_w, R.drawable.zac_e,
            R.drawable.zac_r
    };
    private Integer[] zed = {
            R.drawable.zed_passive, R.drawable.zed_q,
            R.drawable.zed_w, R.drawable.zed_e,
            R.drawable.zed_r
    };
    private Integer[] ziggs = {
            R.drawable.ziggs_passive, R.drawable.ziggs_q,
            R.drawable.ziggs_w, R.drawable.ziggs_e,
            R.drawable.ziggs_r
    };
    private Integer[] zilean = {
            R.drawable.zilean_passive, R.drawable.zilean_q,
            R.drawable.zilean_w, R.drawable.zilean_e,
            R.drawable.zilean_r
    };
    private Integer[] zyra = {
            R.drawable.zyra_passive, R.drawable.zyra_q,
            R.drawable.zyra_w, R.drawable.zyra_e,
            R.drawable.zyra_r
    };

    public AbilityImageAdapter(Context c, int pos) {
        context = c;
        position = pos;
        AbilityData data = new AbilityData();
        switch (position) {
            case 0: images = aatrox;
                    abilityName = data.aatroxName;
                    abilityDesc = data.aatroxDesc;
                    break;
            case 1: images = ahri;
                    break;
            case 2: images = akali;
                    break;
            case 3: images = alistar;
                    break;
            case 4: images = amumu;
                break;
            case 5: images = anivia;
                break;
            case 6: images = annie;
                break;
            case 7: images = ashe;
                break;
            case 8: images = aurelionsol;
                break;
            case 9: images = azir;
                break;
            case 10: images = bard;
                break;
            case 11: images = blitzcrank;
                break;
            case 12: images = brand;
                break;
            case 13: images = braum;
                break;
            case 14: images = caitlyn;
                break;
            case 15: images = cassiopeia;
                break;
            case 16: images = chogath;
                break;
            case 17: images = corki;
                break;
            case 18: images = darius;
                break;
            case 19: images = diana;
                break;
            case 20: images = draven;
                break;
            case 21: images = drmundo;
                break;
            case 22: images = ekko;
                break;
            case 23: images = elise;
                break;
            case 24: images = evelynn;
                break;
            case 25: images = ezreal;
                break;
            case 26: images = fiddlesticks;
                break;
            case 27: images = fiora;
                break;
            case 28: images = fizz;
                break;
            case 29: images = galio;
                break;
            case 30: images = gangplank;
                break;
            case 31: images = garen;
                break;
            case 32: images = gnar;
                break;
            case 33: images = gragas;
                break;
            case 34: images = graves;
                break;
            case 35: images = hecarim;
                break;
            case 36: images = heimerdinger;
                break;
            case 37: images = illaoi;
                break;
            case 38: images = irelia;
                break;
            case 39: images = janna;
                break;
            case 40: images = jarvaniv;
                break;
            case 41: images = jax;
                break;
            case 42: images = jayce;
                break;
            case 43: images = jhin;
                break;
            case 44: images = jinx;
                break;
            case 45: images = kalista;
                break;
            case 46: images = karma;
                break;
            case 47: images = karthus;
                break;
            case 48: images = kassadin;
                break;
            case 49: images = katarina;
                break;
            case 50: images = kayle;
                break;
            case 51: images = kennen;
                break;
            case 52: images = khazix;
                break;
            case 53: images = kindred;
                break;
            case 54: images = kled;
                break;
            case 55: images = kogmaw;
                break;
            case 56: images = leblanc;
                break;
            case 57: images = leesin;
                break;
            case 58: images = leona;
                break;
            case 59: images = lissandra;
                break;
            case 60: images = lucian;
                break;
            case 61: images = lulu;
                break;
            case 62: images = lux;
                break;
            case 63: images = malphite;
                break;
            case 64: images = malzahar;
                break;
            case 65: images = maokai;
                break;
            case 66: images = masteryi;
                break;
            case 67: images = missfortune;
                break;
            case 68: images = monkeyking;
                break;
            case 69: images = mordekaiser;
                break;
            case 70: images = morgana;
                break;
            case 71: images = nami;
                break;
            case 72: images = nasus;
                break;
            case 73: images = nautilus;
                break;
            case 74: images = nidalee;
                break;
            case 75: images = nocturne;
                break;
            case 76: images = nunu;
                break;
            case 77: images = olaf;
                break;
            case 78: images = orianna;
                break;
            case 79: images = pantheon;
                break;
            case 80: images = poppy;
                break;
            case 81: images = quinn;
                break;
            case 82: images = rammus;
                break;
            case 83: images = reksai;
                break;
            case 84: images = renekton;
                break;
            case 85: images = rengar;
                break;
            case 86: images = riven;
                break;
            case 87: images = rumble;
                break;
            case 88: images = ryze;
                break;
            case 89: images = sejuani;
                break;
            case 90: images = shaco;
                break;
            case 91: images = shen;
                break;
            case 92: images = shyvana;
                break;
            case 93: images = singed;
                break;
            case 94: images = sion;
                break;
            case 95: images = sivir;
                break;
            case 96: images = skarner;
                break;
            case 97: images = sona;
                break;
            case 98: images = soraka;
                break;
            case 99: images = swain;
                break;
            case 100: images = syndra;
                break;
            case 101: images = tahmkench;
                break;
            case 102: images = taliyah;
                break;
            case 103: images = talon;
                break;
            case 104: images = taric;
                break;
            case 105: images = teemo;
                break;
            case 106: images = thresh;
                break;
            case 107: images = tristana;
                break;
            case 108: images = trundle;
                break;
            case 109: images = tryndamere;
                break;
            case 110: images = twistedfate;
                break;
            case 111: images = twitch;
                break;
            case 112: images = udyr;
                break;
            case 113: images = urgot;
                break;
            case 114: images = varus;
                break;
            case 115: images = vayne;
                break;
            case 116: images = veigar;
                break;
            case 117: images = velkoz;
                break;
            case 118: images = viktor;
                break;
            case 119: images = vi;
                break;
            case 120: images = vladimir;
                break;
            case 121: images = volibear;
                break;
            case 122: images = warwick;
                break;
            case 123: images = xerath;
                break;
            case 124: images = xinzhao;
                break;
            case 125: images = yasuo;
                break;
            case 126: images = yorick;
                break;
            case 127: images = zac;
                break;
            case 128: images = zed;
                break;
            case 129: images = ziggs;
                break;
            case 130: images = zilean;
                break;
            case 131: images = zyra;
                break;
            default:
                    images = defaultI;
                    break;
        }
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    public Integer[] getSet() {
        return images;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));

        return imageView;
    }
}
