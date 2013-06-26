function onDeviceReady() {
document.getElementById("deviceName").innerHTML = 
device.name;
document.getElementById("version").innerHTML = device.cordova;
document.getElementById("mobilePlatform").innerHTML = 
device.platform;
document.getElementById("platformVersion").innerHTML = device.version;
document.getElementById("uuid").innerHTML = device.uuid;
}
function init() {
	document.addEventListener("deviceready", onDeviceReady, false);
}
