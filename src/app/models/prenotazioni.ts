export interface Prenotazioni {
  idPrenotazione: number;
  idVolo: string;
  idCliente: number;
  dataPrenotazione: Date;
  dataViaggio: Date;
  costoFatturato: number;
  nomeGiorno: string;
}
