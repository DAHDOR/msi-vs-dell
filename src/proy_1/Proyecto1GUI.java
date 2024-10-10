package proy_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.BasicStroke;
import java.awt.Color;

public class Proyecto1GUI extends javax.swing.JFrame {
    Configuration config1, config2;
    Specifications specsCompany1, specsCompany2;
    Company company1, company2;

    public Proyecto1GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.initCompanys();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Texts Files", "txt");
        fileChooser.setFileFilter(filter);
    }

    private void initCompanys() {
        config1 = new Configuration(3, 18, 1, 1, 1, 1, 1, 1, 7); // el ultimo numero es el del carnet
        config2 = new Configuration(3, 18, 1, 1, 1, 1, 1, 1, 3);

        specsCompany1 = new Specifications(1, 5, 6, 5, 1, 3, 80000, 120000); // cambiar de acuerdo a dell
        specsCompany2 = new Specifications(2, 3, 4, 6, 5, 6, 180000, 250000); // cambiar de acuerdo a msi

        company1 = new Company(1, "Dell", 7, specsCompany1, config1, this); // tercer atributo es el carnet, cambiar.
        company2 = new Company(2, "MSI", 3, specsCompany2, config2, this); // tercer atributo es el carnet, cambiar.

        max1.setText("Máximo de Empleados: " + Integer.toString(config1.maxEmployees));
        max2.setText("Máximo de Empleados: " + Integer.toString(config2.maxEmployees));
    }

    public void initEmployeesPanel() {
        motherBoardDevCounter.setText(Integer.toString(company1.config.nMotherboardDevs));
        motherBoardDevCounter2.setText(Integer.toString(company2.config.nMotherboardDevs));
        CPUDevCounter.setText(Integer.toString(company1.config.nCPUDevs));
        CPUDevCounter2.setText(Integer.toString(company2.config.nCPUDevs));
        RAMDevCounter.setText(Integer.toString(company1.config.nRAMDevs));
        RAMDevCounter2.setText(Integer.toString(company2.config.nRAMDevs));
        powerSupplyDevCounter.setText(Integer.toString(company1.config.nPowerSupplyDevs));
        powerSupplyDevCounter2.setText(Integer.toString(company2.config.nPowerSupplyDevs));
        graphicsCardDevCounter.setText(Integer.toString(company1.config.nGraphicsCardDevs));
        graphicsCardDevCounter2.setText(Integer.toString(company2.config.nGraphicsCardDevs));
        assemblersCounter.setText(Integer.toString(company1.config.nAssemblers));
        assemblersCounter2.setText(Integer.toString(company2.config.nAssemblers));
    }

    public void modMotherboardAmount(int id, int amount) {
        if (id == 1) {
            motherboards.setText(Integer.toString(amount) + "/25");
        } else {
            motherboards2.setText(Integer.toString(amount) + "/25");
        }
    }

    public void modCPUAmount(int id, int amount) {
        if (id == 1) {
            cpus.setText(Integer.toString(amount) + "/20");
        } else {
            cpus2.setText(Integer.toString(amount) + "/20");
        }
    }

    public void modRAMAmount(int id, int amount) {
        if (id == 1) {
            rams.setText(Integer.toString(amount) + "/55");
        } else {
            rams2.setText(Integer.toString(amount) + "/55");
        }
    }

    public void modPowerSuppliesAmount(int id, int amount) {
        if (id == 1) {
            powerSupplies.setText(Integer.toString(amount) + "/35");
        } else {
            powerSupplies2.setText(Integer.toString(amount) + "/35");
        }
    }

    public void modGraphicsCardsAmount(int id, int amount) {
        if (id == 1) {
            graphicsCards.setText(Integer.toString(amount) + "/10");
        } else {
            graphicsCards2.setText(Integer.toString(amount) + "/10");
        }
    }

    public void modComputersAmount(int id, int amount) {
        if (id == 1) {
            computers.setText(Integer.toString(amount));
        } else {
            computers2.setText(Integer.toString(amount));
        }
    }

    public void modComputersGraphicsCardsAmount(int id, int amount) {
        if (id == 1) {
            computersGraphicsCards.setText(Integer.toString(amount));
        } else {
            computersGraphicsCards2.setText(Integer.toString(amount));
        }
    }

    public void modDeadline(int id, int amount) {
        if (id == 1) {
            deadline.setText("Dias para la entrega: " + Integer.toString(amount));
        } else {
            deadline2.setText("Dias para la entrega: " + Integer.toString(amount));
        }
    }

    public void modPmActivity(int id, String activity) {
        if (id == 1) {
            pmActvity.setText("El Project Manager está: " + activity);
        } else {
            pmActvity2.setText("El Project Manager está: " + activity);
        }
    }

    public void modPmFaults(int id, int amount, int moneyDeducted) {
        if (id == 1) {
            pmFaltas.setText("Cantidad de faltas del PM: " + amount);
            pmMoneyLoss.setText("Dinero descontado al PM: " + moneyDeducted);
        } else {
            pmFaltas2.setText("Cantidad de faltas del PM: " + amount);
            pmMoneyLoss2.setText("Dinero descontado al PM: " + moneyDeducted);
        }
    }

    public void modDirectorActivity(int id, String activity) {
        if (id == 1) {
            director.setText("El Director está: " + activity);
        } else {
            director2.setText("El Director está: " + activity);
        }
    }

    public void modMotherboardsDev(int id, int motherBoardDevs) {
        if (id == 1) {
            motherBoardDevCounter.setText(Integer.toString(motherBoardDevs));
        } else {
            motherBoardDevCounter2.setText(Integer.toString(motherBoardDevs));
        }
    }

    public void modCPUDev(int id, int CPUDevs) {
        if (id == 1) {
            CPUDevCounter.setText(Integer.toString(CPUDevs));
        } else {
            CPUDevCounter2.setText(Integer.toString(CPUDevs));
        }
    }

    public void modRAMDev(int id, int amount) {
        if (id == 1) {
            RAMDevCounter.setText(Integer.toString(amount));
        } else {
            RAMDevCounter2.setText(Integer.toString(amount));
        }
    }

    public void modPowerSupplyDev(int id, int amount) {
        if (id == 1) {
            powerSupplyDevCounter.setText(Integer.toString(amount));
        } else {
            powerSupplyDevCounter2.setText(Integer.toString(amount));
        }
    }

    public void modGraphicsCardDev(int id, int amount) {
        if (id == 1) {
            graphicsCardDevCounter.setText(Integer.toString(amount));
        } else {
            graphicsCardDevCounter2.setText(Integer.toString(amount));
        }
    }

    public void modAssemblers(int id, int amount) {
        if (id == 1) {
            assemblersCounter.setText(Integer.toString(amount));
        } else {
            assemblersCounter2.setText(Integer.toString(amount));
        }
    }

    public void modProfits(int id, int amount) {
        if (id == 1) {
            profits.setText("Ganancias: " + Integer.toString(amount));
        } else {
            profits2.setText("Ganancias: " + Integer.toString(amount));
        }
    }

    public void modCosts(int id, int amount) {
        if (id == 1) {
            costs.setText("Costos Operativos: " + Integer.toString(amount));
        } else {
            costs2.setText("Costos Operativos: " + Integer.toString(amount));
        }
    }

    public void modUtilities(int id, int amount) {
        if (id == 1) {
            utilities.setText("Utilidades: " + Integer.toString(amount));
        } else {
            utilities2.setText("Utilidades: " + Integer.toString(amount));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Storage2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        motherBoardDevCounter = new javax.swing.JLabel();
        max1 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        CPUDevCounter = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        RAMDevCounter = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        powerSupplyDevCounter = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        graphicsCardDevCounter = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        assemblersCounter = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        motherboards = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rams = new javax.swing.JLabel();
        cpus = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        powerSupplies = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        graphicsCards = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        computers = new javax.swing.JLabel();
        computersGraphicsCards = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        deadline = new javax.swing.JLabel();
        pmActvity = new javax.swing.JLabel();
        director = new javax.swing.JLabel();
        pmFaltas = new javax.swing.JLabel();
        pmMoneyLoss = new javax.swing.JLabel();
        profits = new javax.swing.JLabel();
        costs = new javax.swing.JLabel();
        utilities = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Storage4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        motherBoardDevCounter2 = new javax.swing.JLabel();
        max2 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        CPUDevCounter2 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        RAMDevCounter2 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        powerSupplyDevCounter2 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        graphicsCardDevCounter2 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        assemblersCounter2 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        motherboards2 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        rams2 = new javax.swing.JLabel();
        cpus2 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        powerSupplies2 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        graphicsCards2 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        computers2 = new javax.swing.JLabel();
        computersGraphicsCards2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        deadline2 = new javax.swing.JLabel();
        pmActvity2 = new javax.swing.JLabel();
        director2 = new javax.swing.JLabel();
        pmFaltas2 = new javax.swing.JLabel();
        pmMoneyLoss2 = new javax.swing.JLabel();
        profits2 = new javax.swing.JLabel();
        costs2 = new javax.swing.JLabel();
        utilities2 = new javax.swing.JLabel();
        start = new javax.swing.JToggleButton();
        jButton7 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");

        Storage2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Empleados");

        jLabel2.setText("Productores de placa base");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        motherBoardDevCounter.setText("0");

        max1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        max1.setText("Maximo de Empleados: ");

        jLabel63.setText("Productores de CPUs");

        CPUDevCounter.setText("0");

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        RAMDevCounter.setText("0");

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel64.setText("Productores de Memoria RAM");

        powerSupplyDevCounter.setText("0");

        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel66.setText("Productores de Fuente de alimentación");

        jButton10.setText("+");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        graphicsCardDevCounter.setText("0");

        jButton11.setText("-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("+");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel67.setText("Productores de tarjetas gráficas");

        jLabel68.setText("Ensambladores");

        jButton35.setText("-");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        assemblersCounter.setText("0");

        jButton36.setText("+");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Storage2Layout = new javax.swing.GroupLayout(Storage2);
        Storage2.setLayout(Storage2Layout);
        Storage2Layout.setHorizontalGroup(
            Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Storage2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(max1))
                    .addGroup(Storage2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(motherBoardDevCounter)
                        .addGap(24, 24, 24)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(Storage2Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPUDevCounter)
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(Storage2Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RAMDevCounter)
                        .addGap(24, 24, 24)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(Storage2Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assemblersCounter)
                        .addGap(24, 24, 24)
                        .addComponent(jButton35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton36))
                    .addGroup(Storage2Layout.createSequentialGroup()
                        .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Storage2Layout.createSequentialGroup()
                                .addComponent(powerSupplyDevCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addGroup(Storage2Layout.createSequentialGroup()
                                .addComponent(graphicsCardDevCounter)
                                .addGap(24, 24, 24)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)))))
                .addGap(14, 14, 14))
            .addGroup(Storage2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Storage2Layout.setVerticalGroup(
            Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Storage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(motherBoardDevCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(CPUDevCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(RAMDevCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(powerSupplyDevCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(graphicsCardDevCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jButton35)
                    .addComponent(jButton36)
                    .addComponent(assemblersCounter))
                .addGap(18, 18, 18)
                .addComponent(max1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Almacén");

        jLabel20.setText("Placas base:");

        motherboards.setText("0/25");

        jLabel22.setText("Memoria RAM:");

        rams.setText("0/55");

        cpus.setText("0/20");

        jLabel25.setText("CPU:");

        powerSupplies.setText("0/35");

        jLabel27.setText("Fuentes de alimentación:");

        graphicsCards.setText("0/10");

        jLabel29.setText("Tarjetas gráficas:");

        jLabel31.setText("Estandar: ");

        jLabel33.setText("Con Tarjeta gráfica:");

        computers.setText("0");

        computersGraphicsCards.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Computadoras listas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel29))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(motherboards)
                                    .addComponent(rams)
                                    .addComponent(graphicsCards))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(computers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel8))
                        .addGap(144, 144, 144)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cpus)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(powerSupplies)
                            .addComponent(computersGraphicsCards))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(motherboards)
                    .addComponent(jLabel25)
                    .addComponent(cpus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(rams)
                    .addComponent(jLabel27)
                    .addComponent(powerSupplies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(graphicsCards))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(computers))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(computersGraphicsCards)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setText("Status");

        deadline.setText("Dias para la entrega: 0 ");

        pmActvity.setText("El Project Manager está: - ");

        director.setText("El Director está: -");

        pmFaltas.setText("Cantidad de faltas del PM: 0");

        pmMoneyLoss.setText("Dinero descontado al PM: 0");

        profits.setText("Ganancias: 0");

        costs.setText("Costos Operativos: 0");

        utilities.setText("Utilidades: 0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pmActvity)
                            .addComponent(deadline)
                            .addComponent(director)
                            .addComponent(pmMoneyLoss)
                            .addComponent(pmFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profits)
                            .addComponent(costs)
                            .addComponent(utilities)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel75)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(deadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pmActvity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(director)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pmFaltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pmMoneyLoss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utilities)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setText("Dell");

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel49.setText("MSI");

        Storage4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Empleados");

        jLabel6.setText("Productores de placa base");

        jButton25.setText("+");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("-");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        motherBoardDevCounter2.setText("0");

        max2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        max2.setText("Maximo de Empleados: ");

        jLabel87.setText("Productores de CPUs");

        CPUDevCounter2.setText("0");

        jButton27.setText("-");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("+");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("+");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        RAMDevCounter2.setText("0");

        jButton30.setText("-");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel88.setText("Productores de Memoria RAM");

        powerSupplyDevCounter2.setText("0");

        jButton33.setText("-");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jLabel90.setText("Productores de Fuente de alimentación");

        jButton34.setText("+");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        graphicsCardDevCounter2.setText("0");

        jButton39.setText("-");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText("+");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel91.setText("Productores de tarjetas gráficas");

        jLabel92.setText("Ensambladores");

        jButton41.setText("-");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        assemblersCounter2.setText("0");

        jButton42.setText("+");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Storage4Layout = new javax.swing.GroupLayout(Storage4);
        Storage4.setLayout(Storage4Layout);
        Storage4Layout.setHorizontalGroup(
            Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(max2)
                    .addGroup(Storage4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(motherBoardDevCounter2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25))
                    .addGroup(Storage4Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPUDevCounter2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28))
                    .addGroup(Storage4Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RAMDevCounter2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29))
                    .addGroup(Storage4Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(powerSupplyDevCounter2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton34))
                    .addGroup(Storage4Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(graphicsCardDevCounter2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton40))
                    .addGroup(Storage4Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assemblersCounter2)
                        .addGap(24, 24, 24)
                        .addComponent(jButton41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton42)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(161, 161, 161))
        );
        Storage4Layout.setVerticalGroup(
            Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Storage4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton26)
                    .addComponent(jButton25)
                    .addComponent(motherBoardDevCounter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(CPUDevCounter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jButton30)
                    .addComponent(jButton29)
                    .addComponent(RAMDevCounter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jButton33)
                    .addComponent(jButton34)
                    .addComponent(powerSupplyDevCounter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jButton39)
                    .addComponent(jButton40)
                    .addComponent(graphicsCardDevCounter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Storage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jButton41)
                    .addComponent(jButton42)
                    .addComponent(assemblersCounter2))
                .addGap(18, 18, 18)
                .addComponent(max2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
