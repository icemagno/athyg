const viewer = new Cesium.Viewer("cesiumContainer");

const pointPrimitives = new Cesium.PointPrimitiveCollection({
  blendOption: Cesium.BlendOption.OPAQUE,
  debugShowBoundingVolume : false
});


viewer.scene.globe.show = false;
viewer.scene.skyAtmosphere.show = false;
viewer.scene.sun.show=false;
viewer.scene.moon.show=false;

viewer.bottomContainer.style.display = "NONE"; //capitalized
viewer.fullscreenButton.container.style.display = "none"; //not capitalized
viewer.homeButton.container.style.display="none";
viewer.navigationHelpButton.container.style.display="none";
viewer.timeline.container.style.display="none";


const center = Cesium.Cartesian3.fromDegrees(-114.0, 40.0);
pointPrimitives.modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(center);
pointPrimitives.add({
  color : Cesium.Color.ORANGE,
  pixelSize: 8, // default: 1
  outlineColor: Cesium.Color.BLUE, // default: BLACK
  outlineWidth: 3, // default: 0
  position : new Cesium.Cartesian3(0.0, 0.0, 0.0) // center
});
pointPrimitives.add({
  color : Cesium.Color.YELLOW,
  pixelSize: 8, // default: 1
  outlineColor: Cesium.Color.YELLOW, // default: BLACK
  outlineWidth: 3, // default: 0
  position : new Cesium.Cartesian3(200000.0, 0.0, 0.0) // east
});
pointPrimitives.add({
  color : Cesium.Color.GREEN,
  pixelSize: 8, // default: 1
  outlineColor: Cesium.Color.YELLOW, // default: BLACK
  outlineWidth: 3, // default: 0
  position : new Cesium.Cartesian3(0.0, 200000.0, 0.0) // north
});
pointPrimitives.add({
  color : Cesium.Color.CYAN,
  pixelSize: 8, // default: 1
  outlineColor: Cesium.Color.YELLOW, // default: BLACK
  outlineWidth: 3, // default: 0
  position : new Cesium.Cartesian3(0.0, 0.0, 200000.0) // up
});


viewer.scene.primitives.add( pointPrimitives );

var pgmp = new Cesium.PolylineGlowMaterialProperty({
  color: Cesium.Color.CRIMSON,
  glowPower: 0.01,
 
});

var smh = new Cesium.StripeMaterialProperty({
    evenColor: Cesium.Color.GREEN,
    oddColor: Cesium.Color.YELLOW.withAlpha(0.1),
    repeat: 2,
    offset: 0.5,
    orientation: Cesium.StripeOrientation.HORIZONTAL
});

var smv = new Cesium.StripeMaterialProperty({
    evenColor: Cesium.Color.CYAN,
    oddColor: Cesium.Color.CYAN.withAlpha(0.1),
    repeat: 2,
    offset: 0.25,
    orientation: Cesium.StripeOrientation.VERTICAL
});


/*
const blueEllipsoid = viewer.entities.add({
  name: "Blue ellipsoid",
  position: Cesium.Cartesian3.fromDegrees(-114.0, 40.0, 300000.0),
  ellipsoid: {
    radii: new Cesium.Cartesian3(200000.0, 200000.0, 200000.0),
    material: pgmp,
  },
});
*/

const redSphere = viewer.entities.add({
  name: "Red sphere with black outline",
  position: Cesium.Cartesian3.fromDegrees(-107.0, 40.0, 300000.0),
  ellipsoid: {
    radii: new Cesium.Cartesian3(300000.0, 300000.0, 300000.0),
    material: smh,
    outline: false,
    outlineColor: Cesium.Color.BLACK,
  },
});


const otherSphere = viewer.entities.add({
  name: "Rine",
  position: Cesium.Cartesian3.fromDegrees(-100.0, 40.0, 300000.0),
  ellipsoid: {
    radii: new Cesium.Cartesian3(300000.0, 300000.0, 300000.0),
    material: smv,
    outline: false,
    outlineColor: Cesium.Color.BLACK,
  },
});

viewer.zoomTo(viewer.entities);
