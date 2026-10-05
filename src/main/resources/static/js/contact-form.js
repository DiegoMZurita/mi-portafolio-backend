document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector("#contact-form");
    const status = document.querySelector("#contact-form-status");

    if (!form || !status) {
        return;
    }

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const submitButton = form.querySelector('button[type="submit"]');
        const originalButtonText = submitButton.textContent;

        status.textContent = "";
        status.className = "contact-form-status";
        submitButton.disabled = true;
        submitButton.textContent = "Enviando...";

        try {
            const response = await fetch(form.action, {
                method: "POST",
                body: new FormData(form),
                headers: {
                    Accept: "application/json",
                },
            });

            if (!response.ok) {
                throw new Error("No se pudo enviar el mensaje.");
            }

            form.reset();
            status.textContent = "Mensaje enviado correctamente. Te responderé pronto.";
            status.classList.add("is-success");
        } catch (error) {
            status.textContent = "No se pudo enviar el mensaje. Inténtalo nuevamente en unos minutos.";
            status.classList.add("is-error");
        } finally {
            submitButton.disabled = false;
            submitButton.textContent = originalButtonText;
        }
    });
});
