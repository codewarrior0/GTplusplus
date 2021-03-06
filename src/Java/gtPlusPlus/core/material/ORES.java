package gtPlusPlus.core.material;

import gtPlusPlus.core.material.state.MaterialState;

public final class ORES {

	public static final Material GEIKIELITE = new Material(
			"Geikielite", //Material Name
			MaterialState.ORE, //State
			new short[]{187, 193, 204, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().MAGNESIUM, 1),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 3)
			});	

	public static final Material ZIMBABWEITE = new Material(
			"Zimbabweite", //Material Name
			MaterialState.ORE, //State
			new short[]{193, 187, 131, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 2),
					new MaterialStack(ELEMENT.getInstance().POTASSIUM, 2),
					new MaterialStack(ELEMENT.getInstance().LEAD, 1),
					new MaterialStack(ELEMENT.getInstance().ARSENIC, 4),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 4),
					new MaterialStack(ELEMENT.getInstance().TANTALUM, 4),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 4),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 18)
			});	

	public static final Material TITANITE = new Material(
			"Titanite", //Material Name
			MaterialState.ORE, //State
			new short[]{184, 198, 105, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 2),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 2),
					new MaterialStack(ELEMENT.getInstance().SILICON, 2),
					new MaterialStack(ELEMENT.getInstance().THORIUM, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 10)
			});	

	public static final Material ZIRCONILITE = new Material(
			"Zirconolite", //Material Name
			MaterialState.ORE, //State
			new short[]{45, 26, 0, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 2),
					new MaterialStack(ELEMENT.getInstance().ZIRCONIUM, 2),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 4),
					new MaterialStack(ELEMENT.getInstance().CERIUM, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 14)
			});	

	public static final Material CROCROITE = new Material(
			"Crocoite", //Material Name
			MaterialState.ORE, //State
			new short[]{255, 143, 84, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().LEAD, 1),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 4)
			});	

	public static final Material NICHROMITE = new Material(
			"Nichromite", //Material Name
			MaterialState.ORE, //State
			new short[]{22, 19, 19, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().NICKEL, 1),
					new MaterialStack(ELEMENT.getInstance().COBALT, 1),
					new MaterialStack(ELEMENT.getInstance().IRON, 3),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 2),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 8)
			});	

	public static final Material YTTRIAITE = new Material(
			"Yttriaite", //Material Name
			MaterialState.ORE, //State
			new short[]{255, 143, 84, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 1), //Y not YT/YB
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 3)
			});	

	//Samarskite_Y
	public static final Material SAMARSKITE_Y = new Material(
			"Samarskite (Y)", //Material Name
			MaterialState.ORE, //State
			new short[]{65, 163, 164, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			1, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 2), //Y not YT/YB
					new MaterialStack(ELEMENT.getInstance().IRON, 10),
					new MaterialStack(ELEMENT.getInstance().URANIUM235, 2),
					new MaterialStack(ELEMENT.getInstance().THORIUM, 3),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 2),
					new MaterialStack(ELEMENT.getInstance().TANTALUM, 3)
			});

	//Samarskite_YB
	public static final Material SAMARSKITE_YB = new Material(
			"Samarskite (Yb)", //Material Name
			MaterialState.ORE, //State
			new short[]{95, 193, 194, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			1, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTERBIUM, 2), //Y not YT/YB
					new MaterialStack(ELEMENT.getInstance().IRON, 9),
					new MaterialStack(ELEMENT.getInstance().URANIUM235, 3),
					new MaterialStack(ELEMENT.getInstance().THORIUM, 2),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 3),
					new MaterialStack(ELEMENT.getInstance().TANTALUM, 2)
			});

	public static final Material ZIRCON = new Material(
			"Zircon", //Material Name
			MaterialState.ORE, //State
			new short[]{195, 19, 19, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().ZIRCONIUM, 1),
					new MaterialStack(ELEMENT.getInstance().SILICON, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 4),
			});

	//Gadolinite_Ce
	public static final Material GADOLINITE_CE = new Material(
			"Gadolinite (Ce)", //Material Name
			MaterialState.ORE, //State
			new short[]{15, 159, 59, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CERIUM, 4),
					new MaterialStack(ELEMENT.getInstance().LANTHANUM, 2),
					new MaterialStack(ELEMENT.getInstance().NEODYMIUM, 2),
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 2),
					new MaterialStack(ELEMENT.getInstance().GADOLINIUM, 1),
					new MaterialStack(ELEMENT.getInstance().BERYLLIUM, 2),
					new MaterialStack(ELEMENT.getInstance().SILICON, 7),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 14),
			});

	//Gadolinite_Y
	public static final Material GADOLINITE_Y = new Material(
			"Gadolinite (Y)", //Material Name
			MaterialState.ORE, //State
			new short[]{35, 189, 99, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CERIUM, 2),
					new MaterialStack(ELEMENT.getInstance().LANTHANUM, 2),
					new MaterialStack(ELEMENT.getInstance().NEODYMIUM, 2),
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 4),
					new MaterialStack(ELEMENT.getInstance().GADOLINIUM, 2),
					new MaterialStack(ELEMENT.getInstance().BERYLLIUM, 3),
					new MaterialStack(ELEMENT.getInstance().SILICON, 4),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 9),
			});

	public static final Material LEPERSONNITE = new Material(
			"Lepersonnite", //Material Name
			MaterialState.ORE, //State
			new short[]{175, 175, 20, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			1, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().GADOLINIUM, 2),
					new MaterialStack(ELEMENT.getInstance().DYSPROSIUM, 2),
					new MaterialStack(ELEMENT.getInstance().URANIUM235, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN,32),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 24)
			});

	public static final Material XENOTIME = new Material(
			"Xenotime", //Material Name
			MaterialState.ORE, //State
			new short[]{235, 89, 199, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 1),
					new MaterialStack(ELEMENT.getInstance().PHOSPHORUS, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 4)
			});

	public static final Material YTTRIALITE = new Material(
			"Yttrialite", //Material Name
			MaterialState.ORE, //State
			new short[]{35, 189, 99, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 2),
					new MaterialStack(ELEMENT.getInstance().THORIUM, 2),
					new MaterialStack(ELEMENT.getInstance().SILICON, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 7),
			});

	public static final Material YTTROCERITE = new Material(
			"Yttrocerite", //Material Name
			MaterialState.ORE, //State
			new short[]{35, 19, 199, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CERIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().FLUORINE, 5),
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 1),
			});
	
	public static final Material POLYCRASE = new Material(
			"Polycrase", //Material Name
			MaterialState.ORE, //State
			new short[]{51, 0, 11, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			1, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CERIUM, 1),
					new MaterialStack(ELEMENT.getInstance().URANIUM235, 1),
					new MaterialStack(ELEMENT.getInstance().THORIUM, 1),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 2),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 2),
					new MaterialStack(ELEMENT.getInstance().TANTALUM, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 6)
			});
	
	public static final Material ZIRCOPHYLLITE = new Material(
			"Zircophyllite", //Material Name
			MaterialState.ORE, //State
			new short[]{30, 0, 6, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().POTASSIUM, 3),
					new MaterialStack(ELEMENT.getInstance().SODIUM, 3),
					new MaterialStack(ELEMENT.getInstance().MANGANESE, 7),
					new MaterialStack(ELEMENT.getInstance().IRON, 7),
					new MaterialStack(ELEMENT.getInstance().ZIRCONIUM, 2),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 2),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 2),
					new MaterialStack(ELEMENT.getInstance().SILICON, 8),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 13),
					new MaterialStack(ELEMENT.getInstance().FLUORINE, 7),
			});
	
	public static final Material ZIRKELITE = new Material(
			"Zirkelite", //Material Name
			MaterialState.ORE, //State
			new short[]{229, 208, 48, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (Ca,Th,Ce)Zr(Ti,Nb)2O7
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().THORIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CERIUM, 1),
					new MaterialStack(ELEMENT.getInstance().ZIRCONIUM, 1),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 2),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 7)
			});
	
	public static final Material LANTHANITE_LA = new Material(
			"Lanthanite (La)", //Material Name
			MaterialState.ORE, //State
			new short[]{219, 160, 214, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (La)2(CO3)3·8(H2O)
					new MaterialStack(ELEMENT.getInstance().LANTHANUM, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 3),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 3),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 1),
			});
	
	public static final Material LANTHANITE_CE = new Material(
			"Lanthanite (Ce)", //Material Name
			MaterialState.ORE, //State
			new short[]{186, 113, 179, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (Ce)2(CO3)3·8(H2O)
					new MaterialStack(ELEMENT.getInstance().CERIUM, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 3),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 3),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 1),
			});
	
	public static final Material LANTHANITE_ND = new Material(
			"Lanthanite (Nd)", //Material Name
			MaterialState.ORE, //State
			new short[]{153, 76, 145, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (Nd)2(CO3)3·8(H2O)
					new MaterialStack(ELEMENT.getInstance().NEODYMIUM, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 3),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 3),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 1),
			});
	
	public static final Material HIBONITE = new Material(
			"Hibonite", //Material Name
			MaterialState.ORE, //State
			new short[]{58, 31, 0, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// ((Ca,Ce)(Al,Ti,Mg)12O19)
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CERIUM, 1),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 12),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 12),
					new MaterialStack(ELEMENT.getInstance().MAGNESIUM, 12),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 19),
			});
	
	public static final Material CERITE = new Material(
			"Cerite", //Material Name
			MaterialState.ORE, //State
			new short[]{68, 13, 0, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (Ce,La,Ca)9(Mg,Fe+3)(SiO4)6(SiO3OH)(OH)3
					new MaterialStack(ELEMENT.getInstance().CERIUM, 9),
					new MaterialStack(ELEMENT.getInstance().LANTHANUM, 9),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 9),
					new MaterialStack(ELEMENT.getInstance().MAGNESIUM, 3),
					new MaterialStack(ELEMENT.getInstance().IRON, 3),
					new MaterialStack(ELEMENT.getInstance().SILICON, 7),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 20),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 4)
			});
	
	public static final Material AGARDITE_Y = new Material(
			"Agardite (Y)", //Material Name
			MaterialState.ORE, //State
			new short[]{210, 232, 44, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (YCa)Cu5(As2O4)3(OH)6·3H2O
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().COPPER, 5),
					new MaterialStack(ELEMENT.getInstance().ARSENIC, 6),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 21),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 12)
			});
	
	public static final Material AGARDITE_CD = new Material(
			"Agardite (Cd)", //Material Name
			MaterialState.ORE, //State
			new short[]{170, 188, 33, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (CdCa)Cu7(AsO2)4(O2H)5·3H2O
					new MaterialStack(ELEMENT.getInstance().CADMIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().COPPER, 7),
					new MaterialStack(ELEMENT.getInstance().ARSENIC, 4),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 21),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 11)
			});
	
	public static final Material AGARDITE_LA = new Material(
			"Agardite (La)", //Material Name
			MaterialState.ORE, //State
			new short[]{206, 232, 9, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (LaCa)Cu5(AsO6)2(OH)4·3H2O
					new MaterialStack(ELEMENT.getInstance().LANTHANUM, 1),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().COPPER, 5),
					new MaterialStack(ELEMENT.getInstance().ARSENIC, 2),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 19),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 10)
			});
	
	public static final Material AGARDITE_ND = new Material(
			"Agardite (Nd)", //Material Name
			MaterialState.ORE, //State
			new short[]{225, 244, 78, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (NdCa)Cu6(As3O3)2(O2H)6·3H2O
					new MaterialStack(ELEMENT.getInstance().NEODYMIUM, 1),
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 1),
					new MaterialStack(ELEMENT.getInstance().COPPER, 6),
					new MaterialStack(ELEMENT.getInstance().ARSENIC, 6),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 21),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 12)
			});
	
	public static final Material FLUORCAPHITE = new Material(
			"Fluorcaphite", //Material Name
			MaterialState.ORE, //State
			new short[]{255, 255, 30, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// (Ca,Sr,Ce,Na)5(PO4)3F
					new MaterialStack(ELEMENT.getInstance().CALCIUM, 5),
					new MaterialStack(ELEMENT.getInstance().STRONTIUM, 5),
					new MaterialStack(ELEMENT.getInstance().CERIUM, 5),
					new MaterialStack(ELEMENT.getInstance().SODIUM, 5),
					new MaterialStack(ELEMENT.getInstance().PHOSPHORUS, 3),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 12),
					new MaterialStack(ELEMENT.getInstance().FLUORINE, 6),
			});
	
	public static final Material FLORENCITE = new Material(
			"Florencite", //Material Name
			MaterialState.ORE, //State
			new short[]{249, 249, 124, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// SmAl3(PO4)2(OH)6
					new MaterialStack(ELEMENT.getInstance().SAMARIUM, 1),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 3),
					new MaterialStack(ELEMENT.getInstance().PHOSPHORUS, 1),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 10),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 6)
			});
	
	public static final Material CRYOLITE = new Material(
			"Cryolite", //Material Name
			MaterialState.ORE, //State
			new short[]{205, 205, 255, 0}, //Material Colour
			500,
			1500,
			50,
			75,
			0, //Radiation
			new MaterialStack[]{// Na3AlF6
					new MaterialStack(ELEMENT.getInstance().SODIUM, 3),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 1),
					new MaterialStack(ELEMENT.getInstance().FLUORINE, 6)
			});






}
