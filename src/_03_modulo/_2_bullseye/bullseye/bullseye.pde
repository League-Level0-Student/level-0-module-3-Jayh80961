
void setup() {
   size(500,500);
  // set the size of your sketch
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=8;i>=0;i--){
      if(i % 2 == 0){
       fill(#FF0000);
       }
       else{
       fill(#000000);
       }
       ellipse(250,250,60*i,60*i);  
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
