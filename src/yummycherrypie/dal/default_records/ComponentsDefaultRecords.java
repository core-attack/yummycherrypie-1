package yummycherrypie.dal.default_records;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import yummycherrypie.base_classes.Component;
import yummycherrypie.business_logic.Extensions.LogExtension;
import yummycherrypie.dal.DBHelper;
import yummycherrypie.business_logic.Extensions.OtherExtensions;

/**
 * Created by Nikolay_Piskarev on 12/1/2015.
 */
public class ComponentsDefaultRecords extends DataBaseDefaultRecords{

    public ComponentsDefaultRecords(DBHelper dbh){
        super(dbh);
    }

    /**
     * создание ингредиентов по умолчанию
     */
    public void createDefaultRecords(boolean isDebug){
        dbr.deleteAll(DBHelper.TABLE_COMPONENTS);

        String[] components = new String[]{
                "яйца"/*1*/,
                "мука"/*2*/,
                "крахмал картофельный"/*3*/,
                "крахмал кукурузный"/*4*/,
                "сахар"/*5*/,
                "сода"/*6*/,
                "соль"/*7*/,
                "разрыхлитель"/*8*/,
                "ванилин"/*9*/,
                "масло сливочное"/*10*/,
                "масло подсолнечное"/*11*/,
                "кефир"/*12*/,
                "молоко"/*13*/,
                "какао"/*14*/,
                "кофе"/*15*/,
                "кокос"/*16*/,
                "сметана"/*17*/,
                "мёд"/*18*/,
                "маргарин"/*19*/,
                "сгущенное молоко"/*20*/,
                "шоколад"/*21*/,
                "мастика для обтяжки"/*22*/,
                "мастика для фигурок"/*23*/,
                "загуститель для сметаны"/*24*/,
                "грецкий орех"/*25*/,
                "арахис"/*26*/,
                "фундук"/*27*/,
                "вареная сгущенка"/*28*/,
                "мак"/*29*/,
                "сироп банан"/*30*/,
                "сироп кокос"/*31*/,
                "соус шоколад"/*32*/,
                "соус тоффи"/*33*/,
                "соус малина"/*34*/,
                "соус лесные ягоды"/*35*/,
                "соус киви"/*36*/,
                "ароматизатор ваниль"/*37*/,
                "ароматизатор миндаль"/*38*/,
                "ароматизатор ром"/*39*/,
                "курага"/*40*/,
                "чернослив"/*41*/,
                "ананас консервированный"/*42*/,
                "персики консервированные"/*43*/,
                "клубника замороженная"/*44*/,
                "вишня замороженная"/*45*/,
                "лимон"/*46*/,
                "апельсин"/*47*/,
                "бананы"/*48*/,
                "малина"/*49*/,
                "клубника"/*50*/,
                "черника"/*51*/,
                "краситель"/*52*/,
                "яйца (белок)"/*53*/,
                "сливки"/*54*/,
                "цукаты"/*55*/,
                "миндаль"/*56*/,
                "шоколадная плитка (белая)"/*57*/,
                "имбирь"/*58*/,
                "несквик"/*59*/,
                "шарики для фигурок"/*60*/,
                "желатин"/*61*/,
        };

        double[] componentsPrices = new double[]{
                6.6,//"Яйца"/*1*/,
                68.9,//"Мука"/*2*/,
                38.5,//"Крахмал картофельный"/*3*/,
                35,//"Крахмал кукурузный"/*4*/,
                47.9,//"Сахар"/*5*/,
                24,//"Сода"/*6*/,
                21.6,//"Соль"/*7*/,
                3.05,//"Разрыхлитель"/*8*/,
                1.9,//"Ванилин"/*9*/,
                38.9,//"Масло сливочное"/*10*/,
                59.9,//"Масло подсолнечное"/*11*/,
                21.5,//"Кефир"/*12*/,
                35.9,//"Молоко"/*13*/,
                89,//"Какао"/*14*/,
                226,//"Кофе"/*15*/,
                0,//"Кокос"/*16*/,
                32.9,//"Сметана"/*17*/,
                0,//"Мёд"/*18*/,
                29.9,//"Маргарин"/*19*/,
                54,//"Сгущенное молоко"/*20*/,
                39.9,//"Шоколад"/*21*/,
                290,//"Мастика для обтяжки"/*22*/,
                60,//"Мастика для фигурок"/*23*/,
                12,//"Загуститель для сметаны"/*24*/,
                769,//"Грецкий орех"/*25*/,
                54.9,//"Арахис"/*26*/,
                342,//"Фундук"/*27*/,
                38,//"Вареная сгущенка"/*28*/,
                190,//"Мак"/*29*/,
                259,//"Сироп банан"/*30*/,
                329,//"Сироп кокос"/*31*/,
                259,//"Соус шоколад"/*32*/,
                259,//"Соус тоффи"/*33*/,
                329,//"Соус малина"/*34*/,
                329,//"Соус лесные ягоды"/*35*/,
                259,//"Соус киви"/*36*/,
                17.75,//"Ароматизатор ваниль"/*37*/,
                17.75,//"Ароматизатор миндаль"/*38*/,
                17.75,//"Ароматизатор ром"/*39*/,
                500,//"Курага"/*40*/,
                139,//"Чернослив"/*41*/,
                0,//"Ананас консервированный"/*42*/,
                0,//"Персики консервированные"/*43*/,
                165.3,//"Клубника замороженная"/*44*/,
                0,//"Вишня замороженная"/*45*/,
                0,//"Лимон"/*46*/,
                92,//"Апельсин"/*47*/,
                59.9,//"Бананы"/*48*/,
                0,//"Малина"/*49*/,
                0,//"Клубника"/*50*/,
                0,//"Черника"/*51*/,
                0,//"Краситель"/*52*/,
                0,//"Яйца (белок)"/*53*/
                129,//"Сливки"/*54*/,
                371.5,//"Цукаты"/*55*/,
                1082,//"Миндаль"/*56*/,
                17.72,//"Шоколадная плитка (белая)"/*57*/,
                289.9,//"Имбирь"/*58*/,
                359,//"Несквик"/*59*/,
                109,//"Шарики для фигурок"/*60*/,
                59//"Желатин"/*61*/,
        };

        double[] componentsWeights = new double[]{
                0,//"Яйца"/*1*/,
                2000,//"Мука"/*2*/,
                200,//"Крахмал картофельный"/*3*/,
                200,//"Крахмал кукурузный"/*4*/,
                900,//"Сахар"/*5*/,
                500,//"Сода"/*6*/,
                1000,//"Соль"/*7*/,
                12,//"Разрыхлитель"/*8*/,
                0,//"Ванилин"/*9*/,
                200,//"Масло сливочное"/*10*/,
                1000,//"Масло подсолнечное"/*11*/,  мл
                450,//"Кефир"/*12*/,    мл
                900,//"Молоко"/*13*/,   мл
                100,//"Какао"/*14*/,
                150,//"Кофе"/*15*/,
                0,//"Кокос"/*16*/,
                250,//"Сметана"/*17*/,
                0,//"Мёд"/*18*/,
                200,//"Маргарин"/*19*/,
                360,//"Сгущенное молоко"/*20*/,
                90,//"Шоколад"/*21*/,
                1000,//"Мастика для обтяжки"/*22*/,
                150,//"Мастика для фигурок"/*23*/,
                8,//"Загуститель для сметаны"/*24*/,
                1000,//"Грецкий орех"/*25*/,
                250,//"Арахис"/*26*/,
                200,//"Фундук"/*27*/,
                360,//"Вареная сгущенка"/*28*/,
                400,//"Мак"/*29*/,
                1000,//"Сироп банан"/*30*/,
                1000,//"Сироп кокос"/*31*/,
                1000,//"Соус шоколад"/*32*/,
                1000,//"Соус тоффи"/*33*/,
                1000,//"Соус малина"/*34*/,
                1000,//"Соус лесные ягоды"/*35*/,
                1000,//"Соус киви"/*36*/,
                0,//"Ароматизатор ваниль"/*37*/,
                0,//"Ароматизатор миндаль"/*38*/,
                0,//"Ароматизатор ром"/*39*/,
                1000,//"Курага"/*40*/,
                200,//"Чернослив"/*41*/,
                0,//"Ананас консервированный"/*42*/,
                0,//"Персики консервированные"/*43*/,
                1000,//"Клубника замороженная"/*44*/,
                0,//"Вишня замороженная"/*45*/,
                0,//"Лимон"/*46*/,
                1000,//"Апельсин"/*47*/,
                1000,//"Бананы"/*48*/,
                0,//"Малина"/*49*/,
                0,//"Клубника"/*50*/,
                0,//"Черника"/*51*/,
                0,//"Краситель"/*52*/,
                0,//"Яйца (белок)"/*53*/,
                500,//"Сливки"/*54*/,
                1000,//"Цукаты"/*55*/,
                1000,//"Миндаль"/*56*/,
                100,//"Шоколадная плитка (белая)"/*57*/,
                1000,//"Имбирь"/*58*/,
                1000,//"Несквик"/*59*/,
                1000,//"Шарики для фигурок"/*60*/,
                30,//"Желатин"/*61*/,
        };

        //штучные игридиенты
        //решили, что только яйца целочисленные
        long[] countableArr = new long[] { 1/*яйца*/, 9/*ванилин*/,
                37/*ароматизатор ваниль*/, 38/*ароматизатор миндаль*/, 39/*ароматизатор ром*/
        };

        long id = 1;
        for(int i = 0; i < components.length; i++){

            try {
                Component c = new Component(
                        id,
                        new String(components[i].getBytes(), "UTF-8"),
                        componentsPrices[i],
                        componentsWeights[i],
                        OtherExtensions.include(countableArr, id));
                c.setCreateDate(new Date().getTime());
                dbr.insert(DBHelper.TABLE_COMPONENTS, c.getInsertedColumns());
                LogExtension.Debug("Record created: " + c.toString());

                id++;
            }
            catch (UnsupportedEncodingException ex)
            {
                LogExtension.Error(ex.getMessage());
                LogExtension.Error(ex.getStackTrace().toString());
            }
        }
    }
}
