package com.example.projects.demo.Model;

public enum ShipType {
    Schlachtschiff(4),
    Kreuzer(3),
    Zerstörer(2),
    UBoot(1);

    private int length;

	ShipType(int i) {
		this.length = i;
	}
    int getLength() {
        return length;
    };
}
