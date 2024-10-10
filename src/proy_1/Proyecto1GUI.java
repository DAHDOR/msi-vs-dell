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
        config1 = new Configuration(3, 18, 1, 1, 1, 1, 1, 1, 7);
        config2 = new Configuration(3, 18, 1, 1, 1, 1, 1, 1, 3);

        specsCompany1 = new Specifications(1, 5, 6, 5, 1, 3, 80000, 120000);
        specsCompany2 = new Specifications(2, 3, 4, 6, 5, 6, 180000, 250000);

        company1 = new Company(1, "Dell", 7, specsCompany1, config1, this);
        company2 = new Company(2, "MSI", 3, specsCompany2, config2, this);

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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(motherBoardDevCounter)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                        .addGroup(Storage2Layout.createSequentialGroup()
                                                .addComponent(jLabel63)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CPUDevCounter)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4))
                                        .addGroup(Storage2Layout.createSequentialGroup()
                                                .addComponent(jLabel64)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RAMDevCounter)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5))
                                        .addGroup(Storage2Layout.createSequentialGroup()
                                                .addComponent(jLabel68)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(assemblersCounter)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton36))
                                        .addGroup(Storage2Layout.createSequentialGroup()
                                                .addGroup(Storage2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel67)
                                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(Storage2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(Storage2Layout.createSequentialGroup()
                                                                .addComponent(powerSupplyDevCounter,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jButton9)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton10))
                                                        .addGroup(Storage2Layout.createSequentialGroup()
                                                                .addComponent(graphicsCardDevCounter)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jButton11)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton12)))))
                                .addGap(14, 14, 14))
                        .addGroup(Storage2Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
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
                                .addComponent(max1, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

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
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jLabel29))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(motherboards)
                                                                        .addComponent(rams)
                                                                        .addComponent(graphicsCards))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel25)
                                                                        .addComponent(jLabel27))
                                                                .addGap(18, 18, Short.MAX_VALUE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(computers)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jLabel33)
                                                                .addGap(12, 12, 12))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel8))
                                                .addGap(144, 144, 144)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel3Layout.createSequentialGroup()
                                                        .addComponent(cpus)
                                                        .addGap(19, 19, 19))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(powerSupplies)
                                                        .addComponent(computersGraphicsCards))
                                                .addContainerGap())))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE)));
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
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel31)
                                                .addComponent(computers))
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel33)
                                                .addComponent(computersGraphicsCards)))
                                .addContainerGap(19, Short.MAX_VALUE)));

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
                                                .addGroup(jPanel8Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pmActvity)
                                                        .addComponent(deadline)
                                                        .addComponent(director)
                                                        .addComponent(pmMoneyLoss)
                                                        .addComponent(pmFaltas, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(profits)
                                                        .addComponent(costs)
                                                        .addComponent(utilities)))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(jLabel75)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addContainerGap(19, Short.MAX_VALUE)));

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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(motherBoardDevCounter2)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton25))
                                        .addGroup(Storage4Layout.createSequentialGroup()
                                                .addComponent(jLabel87)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CPUDevCounter2)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton28))
                                        .addGroup(Storage4Layout.createSequentialGroup()
                                                .addComponent(jLabel88)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RAMDevCounter2)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton29))
                                        .addGroup(Storage4Layout.createSequentialGroup()
                                                .addComponent(jLabel90)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(powerSupplyDevCounter2)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton34))
                                        .addGroup(Storage4Layout.createSequentialGroup()
                                                .addComponent(jLabel91)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(graphicsCardDevCounter2)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton39)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton40))
                                        .addGroup(Storage4Layout.createSequentialGroup()
                                                .addComponent(jLabel92)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(assemblersCounter2)
                                                .addGap(24, 24, 24)
                                                .addComponent(jButton41)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton42)))
                                .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(161, 161, 161)));
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
                                .addComponent(max2, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setText("Almacén");

        jLabel52.setText("Placas base:");

        motherboards2.setText("0/25");

        jLabel54.setText("Memoria RAM:");

        rams2.setText("0/55");

        cpus2.setText("0/20");

        jLabel57.setText("CPU:");

        powerSupplies2.setText("0/35");

        jLabel59.setText("Fuentes de alimentación:");

        graphicsCards2.setText("0/10");

        jLabel61.setText("Tarjetas gráficas:");

        jLabel62.setText("Estandar: ");

        jLabel93.setText("Con Tarjeta gráfica:");

        computers2.setText("0");

        computersGraphicsCards2.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Computadoras listas:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel52)
                                                        .addComponent(jLabel54)
                                                        .addComponent(jLabel61))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(motherboards2)
                                                                                        .addComponent(rams2)
                                                                                        .addComponent(graphicsCards2))
                                                                                .addGap(40, 40, 40)
                                                                                .addGroup(jPanel5Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel57)
                                                                                        .addComponent(jLabel59,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)))
                                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                .addComponent(jLabel51)
                                                                                .addGap(107, 107, 107)))
                                                                .addGap(18, 18, Short.MAX_VALUE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(computers2)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jLabel93)
                                                                .addGap(12, 12, 12))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel62)
                                                        .addComponent(jLabel10))
                                                .addGap(144, 144, 144)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel5Layout.createSequentialGroup()
                                                        .addComponent(cpus2)
                                                        .addGap(34, 34, 34))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(powerSupplies2)
                                                        .addComponent(computersGraphicsCards2))
                                                .addContainerGap()))));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel52)
                                        .addComponent(motherboards2)
                                        .addComponent(jLabel57)
                                        .addComponent(cpus2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel54)
                                        .addComponent(rams2)
                                        .addComponent(jLabel59)
                                        .addComponent(powerSupplies2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel61)
                                        .addComponent(graphicsCards2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel62)
                                                .addComponent(computers2))
                                        .addGroup(jPanel5Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel93)
                                                .addComponent(computersGraphicsCards2)))
                                .addContainerGap(19, Short.MAX_VALUE)));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel96.setText("Status");

        deadline2.setText("Dias para la entrega: 0");

        pmActvity2.setText("El Project Manager está: -");

        director2.setText("El Director está: -");

        pmFaltas2.setText("Cantidad de faltas del PM: 0");

        pmMoneyLoss2.setText("Dinero descontado al PM: 0");

        profits2.setText("Ganancias: 0");

        costs2.setText("Costos Operativos: 0");

        utilities2.setText("Utilidades: 0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel10Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pmActvity2)
                                                        .addComponent(deadline2)
                                                        .addComponent(director2)
                                                        .addComponent(pmMoneyLoss2)
                                                        .addComponent(pmFaltas2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(profits2)
                                                        .addComponent(costs2)
                                                        .addComponent(utilities2)))
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGap(184, 184, 184)
                                                .addComponent(jLabel96)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deadline2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pmActvity2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(director2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pmFaltas2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pmMoneyLoss2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profits2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costs2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(utilities2)
                                .addContainerGap(19, Short.MAX_VALUE)));

        start.setText("Comenzar Simulacion");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jButton7.setText("Cargar Datos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Ver Utilidades");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(Storage2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(193, 193, 193)
                                                .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(Storage4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(123, 123, 123))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel49)
                                                        .addGap(300, 300, 300))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jButton7)
                                .addGap(143, 143, 143)
                                .addComponent(start)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1)
                                .addGap(189, 189, 189)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Storage4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Storage2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(start)
                                        .addComponent(jButton7)
                                        .addComponent(jToggleButton1))
                                .addContainerGap(37, Short.MAX_VALUE)));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        company1.addMotherboardDev();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        company1.removeMotherboardDev();
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        company1.removeCPUDev();
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        company1.addCPUDev();
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        company1.addRAMDev();
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        company1.removeRAMDev();
    }// GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
        company1.removePowerSupplyDev();
    }// GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
        company1.addPowerSupplyDev();
    }// GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
        company1.removeGraphicsCardDev();
    }// GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
        company1.addGraphicsCardDev();
    }// GEN-LAST:event_jButton12ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton35ActionPerformed
        company1.removeAssembler();
    }// GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton36ActionPerformed
        company1.addAssembler();
    }// GEN-LAST:event_jButton36ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton25ActionPerformed
        company2.addMotherboardDev();
    }// GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton26ActionPerformed
        company2.removeMotherboardDev();
    }// GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton27ActionPerformed
        company2.removeCPUDev();
    }// GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton28ActionPerformed
        company2.addCPUDev();
    }// GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton29ActionPerformed
        company2.addRAMDev();
    }// GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton30ActionPerformed
        company2.removeRAMDev();
    }// GEN-LAST:event_jButton30ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton33ActionPerformed
        company2.removePowerSupplyDev();
    }// GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton34ActionPerformed
        company2.addPowerSupplyDev();
    }// GEN-LAST:event_jButton34ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton39ActionPerformed
        company2.removeGraphicsCardDev();
    }// GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton40ActionPerformed
        company2.addGraphicsCardDev();
    }// GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton41ActionPerformed
        company2.removeAssembler();
    }// GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton42ActionPerformed
        company2.addAssembler();
    }// GEN-LAST:event_jButton42ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_startActionPerformed
        // Start simulation
        company1.start();
        company2.start();
        start.setEnabled(false);
    }// GEN-LAST:event_startActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                String filename = fileChooser.getSelectedFile().getAbsolutePath();
                File myObj = new File(filename);
                Scanner myReader = new Scanner(myObj);

                String line = myReader.nextLine();
                int segsPerDay = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int deadline = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                line = myReader.nextLine();

                int nMotherboardDevs = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nCPUDevs = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nRAMDevs = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nPowerSupplyDevs = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nGraphicsCardDevs = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nAssemblers = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                line = myReader.nextLine();

                int nMotherboardDevs2 = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nCPUDevs2 = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nRAMDevs2 = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nPowerSupplyDevs2 = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nGraphicsCardDevs2 = Integer.parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int nAssemblers2 = Integer.parseInt(line.split(": ")[1]);

                config1 = new Configuration(segsPerDay, deadline, nMotherboardDevs, nCPUDevs, nRAMDevs,
                        nPowerSupplyDevs,
                        nGraphicsCardDevs, nAssemblers, 7); // 12+7=19
                config2 = new Configuration(segsPerDay, deadline, nMotherboardDevs2, nCPUDevs2, nRAMDevs2,
                        nPowerSupplyDevs2, nGraphicsCardDevs2, nAssemblers2, 3); // 12+3=15

                company1.config = config1;
                company2.config = config2;

                company1.currentDaysUntilDeadline = deadline;
                company2.currentDaysUntilDeadline = deadline;

                initEmployeesPanel();

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }// GEN-LAST:event_jButton7ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed

        var dataset = new XYSeriesCollection();
        dataset.addSeries(company1.series);
        dataset.addSeries(company2.series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Utilidades de los estudios",
                "Tiempo",
                "Utilidades($)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        XYPlot plot = chart.getXYPlot();
        var renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);

        ChartFrame frame = new ChartFrame("Gráfica Actual", chart);
        frame.pack();
        frame.setVisible(true);
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyecto1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto1GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPUDevCounter;
    private javax.swing.JLabel CPUDevCounter2;
    private javax.swing.JLabel RAMDevCounter;
    private javax.swing.JLabel RAMDevCounter2;
    private javax.swing.JPanel Storage2;
    private javax.swing.JPanel Storage4;
    private javax.swing.JLabel assemblersCounter;
    private javax.swing.JLabel assemblersCounter2;
    private javax.swing.JLabel computers;
    private javax.swing.JLabel computers2;
    private javax.swing.JLabel computersGraphicsCards;
    private javax.swing.JLabel computersGraphicsCards2;
    private javax.swing.JLabel costs;
    private javax.swing.JLabel costs2;
    private javax.swing.JLabel cpus;
    private javax.swing.JLabel cpus2;
    private javax.swing.JLabel deadline;
    private javax.swing.JLabel deadline2;
    private javax.swing.JLabel director;
    private javax.swing.JLabel director2;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel graphicsCardDevCounter;
    private javax.swing.JLabel graphicsCardDevCounter2;
    private javax.swing.JLabel graphicsCards;
    private javax.swing.JLabel graphicsCards2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel max1;
    private javax.swing.JLabel max2;
    private javax.swing.JLabel motherBoardDevCounter;
    private javax.swing.JLabel motherBoardDevCounter2;
    private javax.swing.JLabel motherboards;
    private javax.swing.JLabel motherboards2;
    private javax.swing.JLabel pmActvity;
    private javax.swing.JLabel pmActvity2;
    private javax.swing.JLabel pmFaltas;
    private javax.swing.JLabel pmFaltas2;
    private javax.swing.JLabel pmMoneyLoss;
    private javax.swing.JLabel pmMoneyLoss2;
    private javax.swing.JLabel powerSupplies;
    private javax.swing.JLabel powerSupplies2;
    private javax.swing.JLabel powerSupplyDevCounter;
    private javax.swing.JLabel powerSupplyDevCounter2;
    private javax.swing.JLabel profits;
    private javax.swing.JLabel profits2;
    private javax.swing.JLabel rams;
    private javax.swing.JLabel rams2;
    private javax.swing.JToggleButton start;
    private javax.swing.JLabel utilities;
    private javax.swing.JLabel utilities2;
    // End of variables declaration//GEN-END:variables
}
