let currentSlide = 0;

function showSlide(index) {
    const slides = document.querySelector('.slides');
    const totalSlides = document.querySelectorAll('.slide').length;
    if(index >= totalSlides) {
        currentSlide = 0;
    } else if (index <0) {
        currentSlide = totalSlides -1;
    } else {
        currentSlide = index;
    }

    const offset = -currentSlide * (100/3);
    slides.style.transform=`translateX(${offset})`;

}

function prevSlide() {
    showSlide(curentSlide -1);
}

function nextSlide() {
    showSlide(curentSlide +1);
}

setInterval(() => {
    nextSlide();
}, 3000);