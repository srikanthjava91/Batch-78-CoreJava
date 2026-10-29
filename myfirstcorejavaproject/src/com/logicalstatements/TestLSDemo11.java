package com.logicalstatements;

import java.util.Scanner;

//WA POC Related to Restaurant Orders : Invoice Management.
public class TestLSDemo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double total_price = 0;

		do {
			System.out.println("Enter Category like Veg/Non-veg/starters/drinks :");
			String catg = sc.next().toLowerCase();

			switch (catg) {

			case "veg" -> {
				String vyn = "";
				double veg_total_price = 0;

				do {
					System.out.println("Enter the Item : ");
					String veg_item = sc.next();

					switch (veg_item) {

					case "pbm" -> {
						System.out.println("PBM Paneer Butter Masala -Price is : 250/- rs ");
						double pbm_price = 250;
						veg_total_price += pbm_price;
					}
					case "dal" -> {
						System.out.println("Dal Tadaka -Price is : 200/- rs ");
						double dal_price = 200;
						veg_total_price += dal_price;
					}

					case "pvm" -> {
						System.out.println("Paneer Tikka Masala -Price is : 280/- rs ");
						double pvm_price = 280;
						veg_total_price += pvm_price;
					}

					case "mtr" -> {
						System.out.println("Matar Paneer -Price is : 240/- rs ");
						double mtr_price = 240;
						veg_total_price += mtr_price;
					}

					case "pal" -> {
						System.out.println("Palak Paneer -Price is : 230/- rs ");
						double pal_price = 230;
						veg_total_price += pal_price;
					}

					case "chp" -> {
						System.out.println("Chilli Paneer -Price is : 220/- rs ");
						double chp_price = 220;
						veg_total_price += chp_price;
					}

					case "shp" -> {
						System.out.println("Shahi Paneer -Price is : 270/- rs ");
						double shp_price = 270;
						veg_total_price += shp_price;
					}

					case "mix" -> {
						System.out.println("Mix Veg Curry -Price is : 180/- rs ");
						double mix_price = 180;
						veg_total_price += mix_price;
					}

					case "kof" -> {
						System.out.println("Malai Kofta -Price is : 250/- rs ");
						double kof_price = 250;
						veg_total_price += kof_price;
					}

					case "chm" -> {
						System.out.println("Chana Masala -Price is : 190/- rs ");
						double chm_price = 190;
						veg_total_price += chm_price;
					}

					case "dum" -> {
						System.out.println("Dum veg Biriyani-Price is : 300/- rs ");
						double dum_price = 300;
						veg_total_price += dum_price;
					}

					case "veg" -> {
						System.out.println("Veg palauv -Price is : 280/- rs ");
						double veg_price = 280;
						veg_total_price += veg_price;
					}

					default -> System.out.println("Entered Item is not available ");

					}

					System.out.println("Do you want to continue with the Veg Items : Click Y for Yes N for no");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Veg Total Price is : " + veg_total_price);
				total_price += veg_total_price;

			}

			case "Non-veg" -> {
				String nvyn = "";
				double non_veg_total_price = 0;

				do {
					System.out.println("Enter the Item : ");
					String non_veg_item = sc.next();

					switch (non_veg_item) {

					case "mdb" -> {
						System.out.println("Mutton Dum Biriyani : Price is : 500/- rs ");
						double mdb_price = 500;
						non_veg_total_price += mdb_price;
					}

					case "cdb" -> {
						System.out.println("Chicken Dum Biriyani : Price is : 350/- rs ");
						double cdb_price = 350;
						non_veg_total_price += cdb_price;
					}

					case "cfb" -> {
						System.out.println("Chicken Fry Biriyani : Price is : 380/- rs ");
						double cfb_price = 380;
						non_veg_total_price += cfb_price;
					}

					case "pdb" -> {
						System.out.println("Prawns Dum Biriyani : Price is : 450/- rs ");
						double pdb_price = 450;
						non_veg_total_price += pdb_price;
					}

					case "fdb" -> {
						System.out.println("Fish Dum Biriyani : Price is : 400/- rs ");
						double fdb_price = 400;
						non_veg_total_price += fdb_price;
					}

					case "egb" -> {
						System.out.println("Egg Biriyani : Price is : 220/- rs ");
						double egb_price = 220;
						non_veg_total_price += egb_price;
					}

					case "ch65" -> {
						System.out.println("Chicken 65 : Price is : 280/- rs ");
						double ch65_price = 280;
						non_veg_total_price += ch65_price;
					}

					case "cfr" -> {
						System.out.println("Chicken Fry : Price is : 300/- rs ");
						double cfr_price = 300;
						non_veg_total_price += cfr_price;
					}

					case "tka" -> {
						System.out.println("Chicken Tikka : Price is : 320/- rs ");
						double tka_price = 320;
						non_veg_total_price += tka_price;
					}

					case "mfr" -> {
						System.out.println("Mutton Fry : Price is : 450/- rs ");
						double mfr_price = 450;
						non_veg_total_price += mfr_price;
					}

					case "pfr" -> {
						System.out.println("Prawns Fry : Price is : 350/- rs ");
						double pfr_price = 350;
						non_veg_total_price += pfr_price;
					}

					case "cmd" -> {
						System.out.println("Chicken Mandi : Price is : 1550/- rs ");
						double cmd_price = 1550;
						non_veg_total_price += cmd_price;
					}

					default -> System.out.println("Entered item is not availble : ");
					}

					System.out.println("Do you want to continue with Non-veg items ..? Click Y for Yes Click N for No");
					nvyn = sc.next();
				} while (nvyn.equalsIgnoreCase("y"));

				System.out.println("Non-veg Total Price is : " + non_veg_total_price);
				total_price += non_veg_total_price;

			}

			default -> System.out.println("Entered Category is not availble !!");
			}
			System.out.println("Do you want to continue for Categories click Y for Yes N for No..? ");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Total Price : " + total_price);

	}

}
