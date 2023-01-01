function display(a, b, c, d, e, f, g, h, i) {
    this.p1 = a;
    this.p2 = b;
    this.p3 = c;
    this.p4 = d;
    this.p5 = e;
    this.p6 = f;
    this.p7 = g;
    this.p8 = h;
    this.p10 = i;
}

let obj = new display("Tyres", "Brakes", "Axle", "Fuel Injector", "A/C Compressor", "Piston", "A/C Compressor",
    "Radiator", "Engine Fan", "Clutch", "Spare Tire")

console.log(obj)

let automobile_parts = {
    p1: "Tyres",
    p2: "Brakes",
    p3: "Axle",
    p4: "Fuel Injector",
    p5: "Piston",
    p6: "A/C Compressor",
    p7: "Radiator",
    p8: "Engine Fan",
    p9: "Clutch",
    p10: "Spare Tire",
}

let newCar = Object.create(automobile_parts);
newCar.name = "TATA Safari";
console.log("newCar:", newCar)
console.log("newCar:", newCar.p1)