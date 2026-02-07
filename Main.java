// 1. Create the audio object (link to your sound file)
const scareSound = new Audio('scream.mp3'); 

function triggerScare() {
    // 2. Play the sound immediately
    scareSound.play().catch(error => {
        console.log("Sound couldn't play because the user hasn't clicked anything yet.");
    });

    // 3. Show the image
    scareLayer.style.display = 'block';
    
    if (navigator.vibrate) navigator.vibrate([100, 50, 100, 50, 500]);
    
    // Hide everything after 1 second
    setTimeout(() => {
        scareLayer.style.display = 'none';
        output.innerHTML = "<p>> CONNECTION LOST.</p>";
    }, 1000);
}

