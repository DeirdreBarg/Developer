document.getElementById("clearCartButton").addEventListener("click", function() {
    alert("Cart is cleared!");
});
document.getElementById("addToCartButton").addEventListener("click", function() {
    alert("Added to Cart!");
})
document.getElementById("ProcessOrderButton").addEventListener("click", function(){
    alert("Thank you for your order!");
})
document.getElementById("subscribeButton").addEventListener("click", function(){
    alert("Thank you for subscribing!");
})

document.getElementById("submitButton").addEventListener("click", function(){
    alert("Thank you for your message!");
})

document.addEventListener("DOMContentLoaded", function() {
    var modal = document.getElementById("cartModal");
    var btn = document.getElementById("viewCartButton");
    var span = document.getElementsByClassName("close")[0];

    // Open the modal
    btn.onclick = function() {
        modal.style.display = "block";
    }

    // Close the modal
    span.onclick = function() {
        modal.style.display = "none";
    }

    // Close the modal when clicking outside of it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
});